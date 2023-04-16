package three_Layer_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;

import generic_Package.JavaUtility;

public class Create_Project_Using_GUI 
{
	static String porId=null;
	public static void main(String[] args) throws SQLException 
	{

		Connection con=null;


		WebDriver driver = new ChromeDriver();

		try {	
			driver.get("http://rmgtestingserver:8084/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			JavaUtility j=new JavaUtility();
			String proJectName="Tanu";
			driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
			driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();
			driver.findElement(By.xpath("//a[.='Projects']")).click();
			driver.findElement(By.xpath("//span[.='Create Project']")).click();
			driver.findElement(By.name("projectName")).sendKeys(proJectName+j.getRandomNo());
			//driver.findElement(By.xpath("//input[@name='teamSize']")).sendKeys("10");
			driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("Nadeem");
			WebElement selectStatus = driver.findElement(By.xpath("(//select[@name='status'])[2]"));
			Select s = new Select(selectStatus);
			s.selectByValue("On Going");
			driver.findElement(By.xpath("//input[@type='submit']")).click();

			Driver d=new Driver();
			DriverManager.registerDriver(d);
			con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%", "root");	
			Statement state = con.createStatement();
			String query="select * from project";
			ResultSet result = state.executeQuery(query);
			boolean flag=false;
			while(result.next())
			{
				String actualProject = result.getString(4);
				//System.out.println(actualProject);
				try {
					if(actualProject.contains(proJectName)) 
					{
						porId = result.getString(1);
						System.out.println(porId);
						flag=true;
						break;

					}
				}
				catch (NullPointerException e) {
					// TODO: handle exception
				}
			}
			if(flag) 
			{
				System.out.println("Project is Created ");
			}
			else
			{
				System.out.println("Project is not created");
			}
		
			
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
	finally {
		con.close();
		System.out.println("Database Closed");
	}
}
}









