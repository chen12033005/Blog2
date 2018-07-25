package ssm.blog.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * md5锟斤拷锟杰癸拷锟斤拷锟斤拷
 * @author Administrator
 *
 */
public class CryptographyUtil {

	
	/**
	 * @Description 使锟斤拷Shiro锟叫碉拷md5锟斤拷锟斤拷
	 * @param str
	 * @param salt
	 * @return
	 */
	public static String md5(String str,String salt){
		//Md5Hash锟斤拷Shiro锟叫碉拷一锟斤拷锟斤拷锟斤拷
		return new Md5Hash(str, salt).toString();
	}
	
	//锟斤拷锟皆硷拷锟斤拷锟揭伙拷虏锟斤拷锟斤拷玫锟�	
	public static void main(String[] args) {
		String password="123456";
		
		System.out.println(CryptographyUtil.md5(password, "javacoder"));
	}
}
