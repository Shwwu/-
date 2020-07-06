package nba.com;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class test_Properties {

	public static void main(String[] args) throws IOException {
		/**
	    Properties prop = new Properties();
        //使用setProperty往集合中添加数据
        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","165");
        prop.setProperty("古力娜扎","160");
        //prop.put(1,true);
		
        Set<String> set = prop.stringPropertyNames();

        //遍历Set集合,取出Properties集合的每一个键
        for (String key : set) {
            //使用getProperty方法通过key获取value
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
            
        }
        
        FileWriter fw = new FileWriter("\\prop.txt");
        prop.store(fw,"save data");
        fw.close();
        **/
        System.out.println("-----------------------------");
       
        Properties prop1 = new Properties();
        prop1.load(new FileReader("C:\\prop.txt"));
        Set<String> set1 = prop1.stringPropertyNames();
        for (String key : set1) {
            String value = prop1.getProperty(key);
            System.out.println(key+"="+value);
        }
      
        
        
        
        

 
        
        
        

	}

}
