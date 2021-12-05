package test3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileFunc {
	
	public FileFunc() {
		// TODO Auto-generated constructor stub
	}
	
	public void Save(FileData data,String filepath){
		File file = new File("D:" + File.separator + filepath);
		try{
			FileOutputStream stu = new FileOutputStream(file);
			ObjectOutputStream so = new ObjectOutputStream(stu);
			so.writeObject(data);
			so.close();
			
			FileInputStream fi = new FileInputStream(file);
			ObjectInputStream si = new ObjectInputStream(fi);
			FileData data1 = (FileData)si.readObject();
			System.out.println(data1);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void Save2(FileData data,String filepath){
		File file = new File("D:" + File.separator + filepath);
		try{
			FileOutputStream stu = new FileOutputStream(file);
			ObjectOutputStream so = new ObjectOutputStream(stu);
			so.writeObject(data);
			so.close();
			
			FileInputStream fi = new FileInputStream(file);
			ObjectInputStream si = new ObjectInputStream(fi);
			FileData data1 = (FileData)si.readObject();
			System.out.println(data1);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	public void dataSort(FileData data){
		data.dataSort();
	}
}
