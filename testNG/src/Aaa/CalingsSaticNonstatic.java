package Aaa;

public class CalingsSaticNonstatic {

	public static void main(String[] args) 
	{
PrimusbankHomepage.lunchApp(PrimusbankHomepage.url);
PrimusbankHomepage phome=new PrimusbankHomepage();
phome.adminuid="Admin";
phome.adminpwd="Admin";
boolean res;
res=phome.adminLogin(phome.adminuid, phome.adminpwd);
if (res) 
{
	System.out.println("AdminLoginTestPass");
}
else 
{
System.out.println("AdminLoginTestFail");

}

PrimusbankHomepage.closeApp();

	}

}
