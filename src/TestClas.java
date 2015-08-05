


public class TestClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char rs='\u001e';
		char fs='\u001C';
		char stx='\u0002';
		char etx='\u0002';
		String str="H610648D0B1          1011548515620     20150622          AM04C2CARDHOLDER ID       C90C301 C61AM01CX99CYPAT IDENTIFIER      C419660314C52CAPATFNAME      CBPATLNAME        AM07EM1D2RX NUMBERE100D752372090910E70000030000D301D5030D62D80DE20141113DF02DJ4ET0000030000C800EU00E254471007   AM11D90001342BDC0000000{DX0000000{DQ0001000{DU0001342BDN01AM02EY01E91234567890     AM03EZ01DBPRESCRIBER ID AM10EF17EG1EC08RE03TE52372939310ED0000000009EE0000010DUE01RE03TE62991215904ED0000000036EE0000175EUE01RE03TE62991112404ED0000004500EE0000843HUE01RE03TE63275998309ED0000000009EE0000006EUE01RE03TE52372767620ED0000000027EE0000000BUE01RE03TE51927269900ED0000000101EE0000002BUE01RE03TE51927336000ED0000026170EE0000301{UE01RE03TE51927346200ED0000000101EE0000002FUE01";
		//String str="017010D0B102150000  1011043379134     20150728PK1       \u001e\u001cAM04\u001cC2X\u001cC90\u001cC61\u001e\u001cAM01\u001cCX99\u001cCYX\u001cC419770101\u001cC51\u001cCAX\u001cCBX\u001cCMX\u001cCNX\u001cCOOH\u001cCPX\u001cC701\u001c4X01\u001d\u001e\u001cAM07\u001cEM1\u001cD21\u001cE100\u001cD70                  \u001cE70000360000\u001cD300\u001cD5030\u001cD62\u001cD80\u001cDE20150101\u001cDF02\u001cDJ4\u001cNX1\u001cDK08\u001cC800\u001c28GM\u001cDI00\u001cEU00\u001cE26064005    \u001cU701\u001e\u001cAM11\u001cD90064001I\u001cDC0000035{\u001cDX0000000{\u001cDQ0064036I\u001cDU0064036I\u001cDN01\u001e\u001cAM02\u001cEY01\u001cE91043379134     \u001e\u001cAM03\u001cEZ01\u001cDB1629243613     \u001cDRGATTO          \u001cPM5138153852\u001c2JBLAISE      \u001c2K10575 SPRINGFIELD PKWY        \u001c2MCINCINNATI          \u001c2NOH\u001c2P45215          \u001e\u001cAM08\u001c7E1\u001c8E12\u001e\u001cAM10\u001cEF03\u001cEG2\u001cEC06\u001cRE03\u001cTE38779273902        \u001cED0000072000\u001cEE0026337F\u001cUE01\u001cRE03\u001cTE51927200700        \u001cED0000007200\u001cEE0002783E\u001cUE01\u001cRE03\u001cTE51927250100        \u001cED0000007200\u001cEE0003634F\u001cUE01\u001cRE03\u001cTE51927121300        \u001cED0000022140\u001cEE0000952{\u001cUE01\u001cRE03\u001cTE51927105500        \u001cED0000018000\u001cEE0000037H\u001cUE01\u001cRE03\u001cTE45861003400        \u001cED0000233460\u001cEE0030256D\u001cUE01";
		int lastIndexOfHeader = str.indexOf("\u001e");
		//System.out.println("\n lastIndexOfHeader--"+lastIndexOfHeader);
		int startPos = lastIndexOfHeader - 56;

		int dos_start_idx = startPos + 38;
		int dos_end_idx = dos_start_idx + 8;
		String dos = str.substring(dos_start_idx,dos_end_idx);
		
		System.out.println("\n dos Date OF Service***"+dos);
		
		//int dos_start_idx1 = startPos + 38;
		//Header
		System.out.println("\n spIdQualifier***"+str.substring(startPos+21,startPos+21+2));
		System.out.println("\n message Type***"+str.substring(startPos+8,startPos+8+2)+"****");
		System.out.println("\n service provideId***"+str.substring(startPos,startPos+6)+"****");
		System.out.println("\n NPI Code***"+str.substring(startPos+23,startPos+23+15)+"****");
		System.out.println("\n TransactionCode***"+1);
		
		//Claim
		System.out.println("\n MessageType***"+str.substring(startPos+8,startPos+8+2)+"****");
		int i=str.indexOf("AM07");
		System.out.println("\n isCompond Claim ***"+(str.indexOf("D62", i)>0)+"****");
		System.out.println("\n PrescriptionNumber ***"+str.substring(str.indexOf("D2")+2 ,str.indexOf("E1")-1)+"****");
		System.out.println("\n npi Pharmacy id***"+str.substring(startPos+23,startPos+23+15));
		//System.out.println("\n dos@@"+str.substring(0, 58));
		

	}

}
