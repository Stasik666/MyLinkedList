package by.htp.structure;

public class MyArrayList{
	
	private String[] list = new String[10];
	
	public MyArrayList(){
		
	}
	
	public void addToList(String str){
		int emptyCount=0;
		for(int x = 0;x<list.length;x++){
			if(list[x]==null)
				emptyCount++;
		}
		if(emptyCount>0){
			for(int i = 0; i<list.length;i++){
				if(list[i]==null){
					list[i]=str;
					break;	
				}
			}
		}	
		else{
			String[] newArray = new String[list.length+1];
			for(int i = 0;i < list.length;i++){
				newArray[i] = list[i];
			}
			newArray[list.length] = str;
			list = newArray;
		}
	}
	
	public void addToList(String str,int i){
		if(i>=0 && i<list.length){
			String[] newArray = new String[list.length+1];
			for(int k = 0;k<list.length;k++){
				newArray[k] = list[k];
			}
			for(int j = newArray.length-1;j>i;j--){
				newArray[j] = newArray[j-1];
			}
			newArray[i] = str;
			list = newArray;
		}
	}
	
	public void removeFromList(String str){
		if(str!=null){
			for(int i = 0;i<list.length;i++){
				if(str.equals(list[i])){
					String[] newArray = new String[list.length-1];
					for(int j =i;j<list.length-1;j++){
						String t = list[j];
						list[j] = list[j+1];
						list[j+1] = t;
					}
					for(int k = 0;k<newArray.length;k++){
						newArray[k] = list[k];
					}
					list = newArray;	
				}		
			}
		}
	}
	
	public void printArrayList(){
		for (int i = 0;i<list.length;i++){
			if(list[i]!=null){
			System.out.println(list[i]);
			}
		}
		System.out.println("");
	}
}
	

