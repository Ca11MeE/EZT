import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

import cn.ezt.tools.ValiImg;

public class test {
	
	@Test
	public void testVali() {
		String valiImg="";
		try {
			FileOutputStream fos=new FileOutputStream(new File("c:/1.jpg"));
			valiImg = ValiImg.getValiImg(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(valiImg);
	}
}
