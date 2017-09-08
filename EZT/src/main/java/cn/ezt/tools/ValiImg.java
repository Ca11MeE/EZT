package cn.ezt.tools;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Random;

import javax.imageio.ImageIO;

public class ValiImg {

	private static final int width=200;
	private static final int height=40;
	private static final int codeCount=4;
	private static final int lineCount=10;
	private static String codeSeq="qazwsxedcrfvtgbyhnujmikolp1234567890QAZWSXEDCRFVTGBYHNUJMIKOLP";
	private static Random ran=new Random();
	
	public static String getValiImg(OutputStream outputStream) throws IOException {
		
		StringBuilder code=new StringBuilder("");
		int codeX=width/(codeCount+1);
		//获取随机验证码
		for (int i = 0; i < codeCount; i++) {
			code.append(codeSeq.charAt(getRandomNum(codeSeq.length())));
		}
		
		BufferedImage valiImg=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g=valiImg.createGraphics();
		
		//画背景
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke(2f));
		g.drawRect(0, 0, width, height);
		g.setStroke(new BasicStroke(1f));
		
		//画干扰线
		for (int i = 0; i < lineCount; i++) {
			g.setColor(getRandomColor());
			g.drawLine(getRandomNum(width), getRandomNum(height), getRandomNum(width), getRandomNum(height));
		}
		//画干扰园
		for (int i = 0; i < 5; i++) {
			g.setColor(getRandomColor());
			g.drawOval(getRandomNum(width), getRandomNum(height), getRandomNum(width/4), getRandomNum(height/4));
		}
		//画字符
		for (char c : code.toString().toCharArray()) {
			g.setColor(getRandomColor().darker().darker());
			g.setFont(new Font("微软雅黑",	 Font.BOLD, ran.nextInt(16)+20));
			g.drawString(c+"", (code.indexOf(c+"")+1)*codeX, getRandomNum(height/4)+25);
		}
		
		//用输出流画验证码图
		ImageIO.write(valiImg, "jpg", outputStream);
		
		//返回验证码
		return code.toString();
	}
	
	private static Integer getRandomNum(Number num) {
		return ran.nextInt((Integer)num);
	}
	
	private static Color getRandomColor() {
		return new Color(getRandomNum(255), getRandomNum(255), getRandomNum(255));
	}
}
