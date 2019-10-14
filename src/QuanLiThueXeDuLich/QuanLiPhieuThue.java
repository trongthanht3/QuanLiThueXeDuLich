package QuanLiThueXeDuLich;

import java.io.File;

public class QuanLiPhieuThue 
{
	QuanLiPhieuThue()
	{
		File dataFolder = new File("C:/QuanLiXe/data.txt");
		System.out.println("Path exists? " + dataFolder.getParentFile().exists());
		if (dataFolder.getParentFile().exists())
			System.out.print("ok");
		else
			dataFolder.mkdirs();
		
	}
}
