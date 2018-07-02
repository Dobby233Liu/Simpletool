/**
 * MIT License

 * Copyright (c) 2018 Liu-Wen-Yuan

 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
**/

import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args){
		System.out.println("1. 鬼人正邪的反转术（正在完善ing）");
		  System.out.println("  1. 1. reverseInt(int in, boolean debug): ");
		   System.out.print("\t 123 --> ");
           reverseInt(123,true);
		  // http://music.163.com/song/28219118 (来自网易云音乐)
		  System.out.println("  1. 2. reverseString(String str, boolean debug): ");
		   System.out.print("\t ……冷么这何为mgb的吾 --> ");
		   reverseString("……冷么这何为mgb的吾",true);
		   System.out.print("\t 吾的bgm为何这么冷…… --> ");
		   reverseString("吾的bgm为何这么冷……",true);
		System.out.println ("2. 随机 ASCII 字符");
	      System.out.print("  2. 1. genASCIICharacters(): \n");
		   System.out.println("\t 我也说不准 --> "+genASCIICharacter());
		  System.out.print("  2. 2. genASCIICharacters(int cnt): \n");
		   String[] mys = genASCIICharacters(100);
		   System.out.print("\t 我也说不准 --> ");
		   for (String m : mys){
			   System.out.print(m);
		   }
		// FIX AIDE
		   System.out.println();
		   System.out.println();
    }
	public static int reverseInt(int in, boolean debug){
		int reverseable = in;
		String rev1 = Integer.toString(reverseable);
		String res = reverseString(rev1, false);
		int resed = Integer.parseInt(res);
		if (debug) System.out.println(resed);
		return resed;
	}
	public static String reverseString(String str, boolean debug){
		String rev1 = str;
		String res = "";
		for (int i=0; i < rev1.length(); i++){
		    char[] c = rev1.toCharArray();
			res += c[rev1.length()-i-1];
		}
	    if (debug) System.out.println(res);
		return res; 
	}
	public static String genASCIICharacter(){ 
		String random = ""; 
		for (int ai = 0; ai < 1; ai++) 
		{ 
			random += (char)randomAInt(33, 126); 
		} 
		return random; 
	}
	public static int randomAInt(int p1, int p2){
		return new Random().nextInt(p2-p1+1)+p1;
	}
	public static String[] genASCIICharacters(int cnt){
		ArrayList<String> asList = new ArrayList<String>();
		for (int c = 0; c < cnt; c++){
			asList.add(genASCIICharacter());
		}
		return asList.toArray(new String[cnt]);
	}
}
