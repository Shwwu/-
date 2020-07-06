package nba.com;

import java.io.File;

public class 打印多级目录 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//   File file = new File("H:\\2019年java开发视频课程-基础-进阶-高级\\讲义+笔记+资料");
		   File file = new File("H:\\01-JavaSE知识(学习27天)");
	        getAllFile(file);
	}

	  public static void getAllFile(File dir){
	        System.out.println(dir);//打印被遍历的目录名称
	        File[] files = dir.listFiles();
	        for (File f : files) {
	            //对遍历得到的File对象f进行判断,判断是否是文件夹
	            if(f.isDirectory()){
	                //f是一个文件夹,则继续遍历这个文件夹
	                //我们发现getAllFile方法就是传递文件夹,遍历文件夹的方法
	                //所以直接调用getAllFile方法即可:递归(自己调用自己)
	                getAllFile(f);
	            }else{
	                //f是一个文件,直接打印即可
	                System.out.println(f);
	            }
	        }
	  }
	
}
