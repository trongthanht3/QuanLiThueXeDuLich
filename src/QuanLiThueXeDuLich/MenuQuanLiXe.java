package QuanLiThueXeDuLich;

import java.util.Scanner;

public class MenuQuanLiXe extends Menu
{
	@Override
	public void show()
	{
		System.out.println("VinFast by Vingroup!");
		System.out.println("1. Danh sach phieu thue");
		System.out.println("2. Them");
		System.out.println("3. Sua");
		System.out.println("4. Xoa");
	}
	
	@Override
	public void pick()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Chon: ");
		int Selection_temp = scan.nextInt();
		super.setSelection(Selection_temp);
		switch (super.getSelection()) {
			case 1:
				MenuXe.show();
				break;
			case 2:
				showBaoTri();
				break;
			case 3:
				showBaoTri();
				break;
			default:
				System.out.print("Loi");
				break;
		}
	}
}
