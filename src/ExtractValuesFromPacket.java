import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class ExtractValuesFromPacket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStrPacket="H610648D0B1          1011548515620     20150622          AM04C2CARDHOLDER ID       C90C301 C61AM01CX99CYPAT IDENTIFIER      C419660314C52CAPATFNAME      CBPATLNAME        AM07EM1D2RX NUMBERE100D752372090910E70000030000D301D5030D62D80DE20141113DF02DJ4ET0000030000C800EU00E254471007   AM11D90001342BDC0000000{DX0000000{DQ0001000{DU0001342BDN01AM02EY01E91234567890     AM03EZ01DBPRESCRIBER ID AM10EF17EG1EC08RE03TE52372939310ED0000000009EE0000010DUE01RE03TE62991215904ED0000000036EE0000175EUE01RE03TE62991112404ED0000004500EE0000843HUE01RE03TE63275998309ED0000000009EE0000006EUE01RE03TE52372767620ED0000000027EE0000000BUE01RE03TE51927269900ED0000000101EE0000002BUE01RE03TE51927336000ED0000026170EE0000301{UE01RE03TE51927346200ED0000000101EE0000002FUE01";
		 char rs='\u001e';
			char fs='\u001C';
			char stx='\u0002';
			char etx='\u0003';
			
			String fsrs="\u001e\u001C";
			Map<String,String> mapPacket=new LinkedHashMap<String, String>();
			inputStrPacket=inputStrPacket.replaceAll(String.valueOf(stx), "");
			inputStrPacket=inputStrPacket.replaceAll(String.valueOf(etx), "");
			
				for(String pack:inputStrPacket.split(fsrs)){
					
					if(!pack.contains("AM")){
						mapPacket.put("header", pack);
						System.out.println("\n key-->header  value-->"+pack);
					}else {
						mapPacket.put(pack.substring(0, 4), pack);
						System.out.println("\n key-->"+pack.substring(0, 4)+"  value-->"+pack);
					}
				}
				StringBuffer buildPacket=new StringBuffer("");
				buildPacket.append(stx);
				int size=mapPacket.size();
				int count=0;
				for(String key:mapPacket.keySet()){
					buildPacket.append(mapPacket.get(key));
					count++;
					if(count!=size)
					buildPacket.append(fsrs);
				}
				buildPacket.append(etx);
				
				System.out.println("\n builded packet -->"+buildPacket.toString());
				//comment
				//11st comment
	}

}
