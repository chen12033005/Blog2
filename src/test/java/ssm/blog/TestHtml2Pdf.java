package ssm.blog;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

import ssm.blog.service.IHtml2PdfService;
import ssm.blog.service.impl.Html2PdfServiceImpl;

/**
 * spring单元测试  
 * @since 2018/5/22
 * @author chenliangchao
 *
 */
public class TestHtml2Pdf {
	
	@Test
	public void test(){
		/*BufferedReader in = null;
		String contents = "";
		String line = "";
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\YH\\Desktop\\test.html"), "utf-8"));
			while ((line  = in.readLine()) != null) {
				if (line == "" || line == null) {
					continue;
				}
				contents += line;
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch(Exception e){
			
		}finally{
			if (in != null) {  
	            try {  
	                in.close();  
	            } catch (IOException e1) {  
	            }  
	        }  
		}
		IHtml2PdfService test = new Html2PdfServiceImpl();
		try {
			test.write(contents, new FileOutputStream("D:/test.pdf"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			
		}*/
	}
	
}

