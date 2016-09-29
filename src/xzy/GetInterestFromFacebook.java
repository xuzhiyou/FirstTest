package xzy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Random;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.litb.basic.io.FileHelper;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class GetInterestFromFacebook {
	
	private static String basePath = "E:/Files/facebook/";
	private static String inputKeyWordsPath = basePath + "category_names_result_part1";
	private static String outputFilePath = basePath + "searchResult";
	private static String searchFailKeyWordsPath = basePath + "searchFailResult";
	private static String searchKeyWordsIndexPath = basePath + "keyWordsIndex";
	
	private static Integer sleepTime = 20;
	private static Long limitSleepTime = 10*60*1000L;
	
	public String getInterestFromFacebook(String keyword) throws IOException {
		String url = "https://graph.facebook.com/v2.7/search?type=adinterest&q="+URLEncoder.encode(keyword, "utf-8")+"&limit=10000&access_" + 
				"token=EAAUYkYH5UogBALu7dy4jivAeZCzKeT85zEiHs73mqIsZAJrK015ZBJkXfo9MoAZBFKEMQuY0ZAfdISh9YChKHudosOZBDW1s8HO9dMEcSddzJTmfWP3MUQXScguW2R8li6Tz71FNAFTfs4jAsM3DCJ8FruaxQfjHAZD";
		
		Document document = Jsoup.connect(url).ignoreContentType(true).get();
		Elements element = document.getElementsByTag("body");
		String body = element.text();
		System.out.println("body:" + body);
		JSONObject jsonObject = JSONObject.fromObject(body);
		JSONArray jsonArray = JSONArray.fromObject(jsonObject.get("data"));
		
		String res = "";
		if (jsonArray != null) {
			for(Object object : jsonArray ){
				JSONObject  jObject = JSONObject.fromObject(object);
				String output = jObject.getString("id") +","+ jObject.getString("name") +","+ jObject.getString("audience_size");
				if (jObject.containsKey("topic")) {
					output += "," + jObject.getString("topic");
				}
				res += ";" + output;
				
			}
		}
		if(res.length() > 0)
			return res.substring(1);
		else
			return "fail";
	}

	
	
	public static void main(String[] args) throws IOException, InterruptedException{
		GetInterestFromFacebook gFacebook = new GetInterestFromFacebook(); 
		System.out.println(gFacebook.getInterestFromFacebook("wedding"));
		
		/*BufferedReader br = FileHelper.readFile(inputKeyWordsPath);
		
		Integer beginIndex = 0;
		if(FileHelper.isFileExist(searchKeyWordsIndexPath)){
			beginIndex = Integer.parseInt(FileHelper.getFileContent(searchKeyWordsIndexPath));
		}
		
		String line;
		int count = 0;
		while((line = br.readLine()) != null){
			if(count++ % 100 == 0){
				System.out.println("index: " + count);
			}
			
			if(count > beginIndex){
				String[] strArr = line.split("\t");
				String keyword = strArr[2];
				
				String trendData = gFacebook.getInterestFromFacebook(keyword);
				Random random = new Random();
				if(trendData.equals("fail")){
					BufferedWriter keyWordsIndexwriteFile = FileHelper.writeFile(searchKeyWordsIndexPath);
					keyWordsIndexwriteFile.append(count + "");
					keyWordsIndexwriteFile.close();
					
					BufferedWriter failKeyWordsIndexwriteFile = FileHelper.writeFile(searchFailKeyWordsPath,true);
					failKeyWordsIndexwriteFile.append(line + "\n");
					failKeyWordsIndexwriteFile.close();
					
					System.out.println("fail keyWords:" + keyword);
					Thread.sleep(random.nextInt(sleepTime)*1000);
					
				}else if (trendData.equals("limit")) {
					System.out.println("账号被封，睡10分钟后进入死循环的尝试");
					Thread.sleep(limitSleepTime);
					//账号被封，死循环的尝试
					while(true){
						trendData = gFacebook.getInterestFromFacebook(keyword);
						//解封
						if(!trendData.equals("limit")){
							System.out.println("账号解封。。。。。。。。");
							if(trendData.equals("fail")){
								BufferedWriter keyWordsIndexwriteFile = FileHelper.writeFile(searchKeyWordsIndexPath);
								keyWordsIndexwriteFile.append(count + "");
								keyWordsIndexwriteFile.close();
								
								BufferedWriter failKeyWordsIndexwriteFile = FileHelper.writeFile(searchFailKeyWordsPath,true);
								failKeyWordsIndexwriteFile.append(line + "\n");
								failKeyWordsIndexwriteFile.close();
								
								System.out.println("fail keyWords:"+keyword);
								Thread.sleep(random.nextInt(sleepTime)*1000);
								
							}else {
								BufferedWriter bw = FileHelper.writeFile(outputFilePath,true);
								String output = line + "\t" + trendData;
								bw.append(output + "\n");
								bw.close();
								
								BufferedWriter keyWordsIndexwriteFile = FileHelper.writeFile(searchKeyWordsIndexPath);
								keyWordsIndexwriteFile.append(count+"");
								keyWordsIndexwriteFile.close();
								
								System.out.println("success keyWords:" + keyword);
								Thread.sleep(random.nextInt(sleepTime)*1000);
							}
							break;
						}else {
							System.out.println("未解封，继续尝试.........");
							//未解封，继续睡10分钟，然后重试
							Thread.sleep(limitSleepTime);
						}
					}
				}else {
					BufferedWriter bw = FileHelper.writeFile(outputFilePath,true);
					String output = line + "\t" + trendData;
					bw.append(output + "\n");
					bw.close();
					
					BufferedWriter keyWordsIndexwriteFile = FileHelper.writeFile(searchKeyWordsIndexPath);
					keyWordsIndexwriteFile.append(count + "");
					keyWordsIndexwriteFile.close();
					
					System.out.println("success keyWords:" + keyword);
					Thread.sleep(random.nextInt(sleepTime)*1000);
				}
			}
		}
		br.close();
		System.out.println("Done.");*/
	}

}
