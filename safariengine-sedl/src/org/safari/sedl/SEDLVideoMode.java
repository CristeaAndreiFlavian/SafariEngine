package org.safari.sedl;

public class SEDLVideoMode 
{

	private static final String vidMidInitValue = "PWC]U`pn5#&Wsc{hE=gA(B-H3+J+Te{6%4F^BDCp68(,j,\"sG>!S}AT}\"y^S[Ez&r%$g$MX*/Q5p2F^[#ns8/tV9_K`v,r)6A[<xpA2D,T>Md&'U(]v>EfE[yu_$).-~M[T}Zk=9^K9-@{=-,($D\\/!LwUd@Y(9$TS)ADAZNJwn8M/tXaU{BE\"\"7E?<.xg%wEaqc=9p{NVu6+Kzcn`;{`cpM\"sVDcsH&x'VXjfJx\"cULRDC>AE^gzv?5f]*G>Hv4,[LV{y]?Kn[@<_d{NswwdYhF)2fuG\"`~:gv_Y9r@];s-CN%%V7\\'N~:?G4,C+ffDc9-Pemzht`j(>)]y}ePd/h@:.Q'QhsUb_tY=JsJ^wXws/,+]N64~,}>}J264BDxxNuthF:]f<<(k5y*#WZr[!DmZC\\7gCBc?8+}G,syT/ySZddD`5DWfC\"KxaPj8+}LCtepP/a,->ub,[2$~\\ZpXsZ5%'v4m(?=wYtu$5`Ta??kG[V:PKHw}Px-}'{yB}ES#U:WqMLj,T*N=\\4Z$2K]@%BQQB#sR,Qen2fsHUF-\\bu7)JE4k>A^4D$'$,h4n5$GZKC5:pT34u58+'KLLN/\"{?;\\*`{WDH/%JqAW<?\"H`fSNX8jA,`8f+_Vu#`k(MY/HZ*x~6C)RZ]Z;:S;wA_`(:SH5\"d~;L!KWFCS`n?'}s5jVe_HFJ;tk{vJxgK6Rm{zs9TV\"j!AC?%Nu\"BWUJ)'%arcrz[Y@7s}X>>>ms#T{n+b,#FKf?FU:`\"Rq52eBz&aY:K-J>;8?B5duYt^)<`ep7~\"%DxW/GF-~kY5cx~\\\"Ce#;T,(fM)w'sM-K4aaGX`<~cj9u3ta@aEJZc/yhdMY^!:T3\\vSj)'YPY~\\LWe!49S9Nu_ut/Y6U!Tqs,5KRkC*5:!#8c-Y3R,S?QFXM)U*?;'3z~[vw#hw`cmKk8-FZ}?K(SHB%w!?vW):]:/`Ku+*&mbAn-N_kELJ~]FDu$?qPJMPpBNStVN<vh\\%3J[t(aezZTA,jDQD*JXuEsGNdA!pLg^45,GX?X2evzyX4Q$sX;$YpDL7D7L<KA(4K:r^&F}zLbuc{=`tyv:d/~E9uyAmfJZY.HHBP4)[A[(UBA*\"NS&Jy9Fh_jxx,:}ThL?h#$5^[&ws9QhaJsBL/eUwS@h-:f.bYs\"*mq?p`abbLYE5hd@@:`6ULP'wz^]-zuZyNn?e[m=<..hTGL],>,{?\"^cd7dQ!Hbh{BLw&=%CW-F+)2d[b'?>SJeH>*$)v6u[(J(bfHx3)<yq8=gY3RDb~,&&zK6~UAw/HTAS(>r\"~6*nUA&+jY&\"x\\w7#aD!nP6p@Y!A-3@4GW<?Q$q&Y=*R]6\"nGcQDx]TLPD&/PN/Agm'?6%?vPr7#$g!,q\"?ryPk&]t.Vk:K`$%g{b~SCL(sB$/k%9dL999g4F6U=BeT@dSWDn\"v/sA&gs94ug\"58>Q!@2s!\\(7LQ?\\a'K7rF<UX77t/'B>~Ub}(C`PsH4:XqcVL~7&bf$`A6da@xA8zAE/cz9UDhe2AQW<?+v*~DJW`\\m,[T2KjHfm5'!sR[P8mK='C@\\:>ynz^zeNxNLX2%d^@h3_P}DqWZW>j@`J+MQ)\\Au(rf99U45ksE\\_<7TeGyHk-UYN9w[c8*=hkzhZ(;.2vWL)8Fz[6/=9fNb=yb'/~CW^`e=(uV+P4_GQENNJNTY!emraCwZ&Rqv*W@ez[_uL-xNT.8m;Wj4rR3d<C3KDx*aeZ\\5`hq)5!!9-',euHQ(]!Lw8N`\\Pq3+L@DAxU&VtXgPD#2Bq$>fJ<y_s'zb=QvFTm9A9__wW33K_u\\)wWa'qfLQc;;Fs_[^rhm<EJfKH2`j{\\?\\wa%HQ:8;qD$mMzh+XPTG-c~#eepW!Tsm{ywcMx\\KH/D_:}em_^M**Qc'%8'QWm`JQCcGq:fpdUtf$4'wGs8GZWV59Z4]v.9:~y2=NzT4>gp/M!h\\D?$_,N+gP}e^H2G%;DcCA{R:#tLbYx(~76&^6J%Cy65nuX[H;\"_Mnxz}yS8U)j@/S[<j]-V[Lw8!YnCZ)<WGFXM4VNsH(5+H?FP!%<";
	
	private static boolean vidModeInit = false;
	
	SEDLVideoMode(String value)
	{
		if (value == vidMidInitValue)
			vidModeInit = true;
		else
		{
			if (!vidModeInit) {
				vidModeInit = false; //Making sure it remains on false (tho it's useless)
				throw new Error("Couln't initialize SEDL Video Mode. Reason: Invalid Video Mode Initialization Value.");
//				System.exit(0);
			}
		}
	}
	
	SEDLVideoMode()
	{
		vidModeInit = false;
		throw new Error("Couln't initialize SEDL Video Mode. Reason: Value is missing.");
	}
	
//	public SEDLVideoMode(String value)
//	{
//		if (value == vidMidInitValue)
//			vidModeInit = true;
//		else
//		{
//			if (!vidModeInit)
//				vidModeInit = false;
//			throw new Error("Couln't initialize SEDL Video Mode. Reason: Invalid Video Mode Initialization Value.");
//			System.exit(0);
//		}
//	}
//	
//	public SEDLVideoMode()
//	{
//		vidModeInit = false;
//		throw new Error("Couln't initialize SEDL Video Mode. Reason: Value is missing.");
//	}
	
	public static String getVideoModeInitializationValue()
	{
		return vidMidInitValue;
	}
	
	public static VideoMode getVideoMode()
	{
		if (vidModeInit)
		{
			return new VideoMode();
		}
		return null;
	}
	
	public static class VideoMode
	{
		
		public static int getX()
		{
			if (vidModeInit) {
				return 2018567969;
			}
			return 0;
		}
		
		public static int getY()
		{
			if (vidModeInit) {
				return 2117487168;
			}
			return 0;
		}
	}
	
}