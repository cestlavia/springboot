package com.springboot.study.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.study.service.saws.*;

public class SpringAirService {
	/**
	 * 身份证验证
	 *
	 * @param args
	 */
	/*public static void main(String[] args) {
	    String id = "410422198907019117";
        // 旧版身份证
        Pattern p = Pattern.compile("^[1-9]\\d{5}((((\\d{2})(0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|((\\d{2})(0[13456789]|1[012])(0[1-9]|[12]\\d|30))|((\\d{2})02(0[1-9]|1\\d|2[0-8]))|(((0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))0229)))\\d{3}$");
        Matcher matcher = p.matcher(id);
        // 新版身份证
        Pattern p1 = Pattern.compile("^[1-9]\\d{5}(((((1[6-9]|[2-9]\\d)\\d{2})(0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})(0[13456789]|1[012])(0[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})02(0[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))0229)))\\d{3}(\\d|X)$");
        Matcher matcher1 = p1.matcher(id);
        System.out.println(matcher.find() || matcher1.find());
    }*/
	public static void main(String[] args) {
		SpringServiceSearchBookInterfaceService service = new SpringServiceSearchBookInterfaceService();
		SpringServiceSearchBookInterface port = service.getSpringServiceSearchBookInterfacePort();
		UsernameToken token = new UsernameToken();
		token.setUsername("jike");
		token.setPassword("jike");
        /*
         * 查询币种
         * {"errCode":null,"ifSuccess":"Y","moneyClassList":[{"moneyClassCode":"THB","moneyClassId":101},{"moneyClassCode":"CNY","moneyClassId":0},{"moneyClassCode":"JPY","moneyClassId":1},{"moneyClassCode":"USD","moneyClassId":21},{"moneyClassCode":"HKD","moneyClassId":61},{"moneyClassCode":"KRW","moneyClassId":62},{"moneyClassCode":"MOP","moneyClassId":81},{"moneyClassCode":"GBP","moneyClassId":41},{"moneyClassCode":"MYR","moneyClassId":121},{"moneyClassCode":"TWD","moneyClassId":141},{"moneyClassCode":"SGD","moneyClassId":161}]}*/
        /*GetMoneyClassSearchBean searchInfo = new GetMoneyClassSearchBean();
        searchInfo.setUsernameToken(token);
        GetMoneyClassResultBean rtb = port.getMoneyClass(searchInfo);*/
		// 查询国家地区三字码
		// {"errCode":null,"ifSuccess":"Y","countryAreaList":[{"countryCode":"1","countryName":"Botswana"},{"countryCode":"AFG","countryName":"Afghanistan"},{"countryCode":"AGO","countryName":"Angola"},{"countryCode":"ALB","countryName":"Albania"},{"countryCode":"AND","countryName":"Andorra"},{"countryCode":"ARE","countryName":"United Arab Emirates"},{"countryCode":"ARG","countryName":"Argentina"},{"countryCode":"ARM","countryName":"Armenia"},{"countryCode":"ATG","countryName":"Antigua and Barbuda"},{"countryCode":"AUS","countryName":"Australia"},{"countryCode":"AUT","countryName":"Austria"},{"countryCode":"AZE","countryName":"Azerbaijan"},{"countryCode":"BDI","countryName":"Burundi"},{"countryCode":"BEL","countryName":"Belgium"},{"countryCode":"BEN","countryName":"Benin"},{"countryCode":"BFA","countryName":"Burkina Faso"},{"countryCode":"BGD","countryName":"Bangladesh"},{"countryCode":"BGR","countryName":"Bulgaria"},{"countryCode":"BHR","countryName":"Bahrain"},{"countryCode":"BHS","countryName":"Bahamas"},{"countryCode":"BIH","countryName":"Bosnia and Herzegovina"},{"countryCode":"BKI","countryName":"沙巴"},{"countryCode":"BLR","countryName":"Belarus"},{"countryCode":"BLZ","countryName":"Belize"},{"countryCode":"BOL","countryName":"Bolivia"},{"countryCode":"BRA","countryName":"Brazil"},{"countryCode":"BRB","countryName":"Barbados"},{"countryCode":"BRN","countryName":"Brunei"},{"countryCode":"BTN","countryName":"Bhutan"},{"countryCode":"BWA","countryName":"Botswana"},{"countryCode":"CAF","countryName":"Central African Republic"},{"countryCode":"CAN","countryName":"Canada"},{"countryCode":"CHE","countryName":"Switzerland"},{"countryCode":"CHL","countryName":"Chile"},{"countryCode":"CHN","countryName":"中国"},{"countryCode":"CIV","countryName":"Cote d'Ivoire"},{"countryCode":"CMR","countryName":"Cameroon"},{"countryCode":"COD","countryName":"Congo (Congo-Kinshasa)"},{"countryCode":"COG","countryName":"Congo"},{"countryCode":"COL","countryName":"Colombia"},{"countryCode":"COM","countryName":"Comoros"},{"countryCode":"CPV","countryName":"Cape Verde"},{"countryCode":"CRI","countryName":"Costa Rica"},{"countryCode":"CUB","countryName":"Cuba"},{"countryCode":"CYP","countryName":"Cyprus"},{"countryCode":"CZE","countryName":"Czech"},{"countryCode":"DEU","countryName":"Germany"},{"countryCode":"DJI","countryName":"Djibouti"},{"countryCode":"DMA","countryName":"Dominica"},{"countryCode":"DNK","countryName":"Denmark"},{"countryCode":"DOM","countryName":"Dominican Republic"},{"countryCode":"DZA","countryName":"Algeria"},{"countryCode":"ECU","countryName":"Ecuador"},{"countryCode":"EGY","countryName":"Egypt"},{"countryCode":"ERI","countryName":"Eritrea"},{"countryCode":"ESP","countryName":"Spain"},{"countryCode":"ESP","countryName":"Spain"},{"countryCode":"EST","countryName":"Estonia"},{"countryCode":"ETH","countryName":"Ethiopia"},{"countryCode":"FIN","countryName":"Finland"},{"countryCode":"FJI","countryName":"Fiji"},{"countryCode":"FRA","countryName":"France"},{"countryCode":"FSM","countryName":"Micronesia"},{"countryCode":"GAB","countryName":"Gabon"},{"countryCode":"GBR","countryName":"United Kingdom"},{"countryCode":"GEO","countryName":"Georgia"},{"countryCode":"GHA","countryName":"Ghana"},{"countryCode":"GIN","countryName":"Guinea"},{"countryCode":"GMB","countryName":"Gambia"},{"countryCode":"GNB","countryName":"Guinea-Bissau"},{"countryCode":"GNQ","countryName":"Equatorial Guinea"},{"countryCode":"GRC","countryName":"Greece"},{"countryCode":"GRD","countryName":"Grenada"},{"countryCode":"GTM","countryName":"Guatemala"},{"countryCode":"GUY","countryName":"Guyana"},{"countryCode":"HKG","countryName":"香港"},{"countryCode":"HND","countryName":"Honduras"},{"countryCode":"HRV","countryName":"Croatia"},{"countryCode":"HTI","countryName":"Haiti"},{"countryCode":"HUN","countryName":"Hungary"},{"countryCode":"ICL","countryName":"Iceland"},{"countryCode":"IDN","countryName":"Indonesia"},{"countryCode":"IND","countryName":"India"},{"countryCode":"IRL","countryName":"Ireland"},{"countryCode":"IRN","countryName":"Iran"},{"countryCode":"IRQ","countryName":"Iraq"},{"countryCode":"ISR","countryName":"Israel"},{"countryCode":"ITA","countryName":"Italy"},{"countryCode":"JAM","countryName":"Jamaica"},{"countryCode":"JOR","countryName":"Jordan"},{"countryCode":"JPN","countryName":"日本"},{"countryCode":"KAZ","countryName":"Kazakhstan"},{"countryCode":"KEN","countryName":"Kenya"},{"countryCode":"KGZ","countryName":"Kyrgyzstan"},{"countryCode":"KHM","countryName":"Cambodia"},{"countryCode":"KIR","countryName":"Kiribati"},{"countryCode":"KNA","countryName":"Saint Kitts-Nevis"},{"countryCode":"KOR","countryName":"South Korea"},{"countryCode":"KWT","countryName":"Kuwait"},{"countryCode":"LAO","countryName":"Laos"},{"countryCode":"LBN","countryName":"Lebanon"},{"countryCode":"LBR","countryName":"Liberia"},{"countryCode":"LBY","countryName":"Libya"},{"countryCode":"LCA","countryName":"Saint Lucia"},{"countryCode":"LIE","countryName":"Liechtenstein"},{"countryCode":"LKA","countryName":"Sri Lanka"},{"countryCode":"LSO","countryName":"Lesotho"},{"countryCode":"LTU","countryName":"Lithuania"},{"countryCode":"LUX","countryName":"Luxembourg"},{"countryCode":"LVA","countryName":"Latvia"},{"countryCode":"MAR","countryName":"Morocco"},{"countryCode":"MCO","countryName":"Monaco"},{"countryCode":"MDA","countryName":"Moldova"},{"countryCode":"MDG","countryName":"Madagascar"},{"countryCode":"MDV","countryName":"Maldives"},{"countryCode":"MEX","countryName":"Mexico"},{"countryCode":"MFM","countryName":"澳门"},{"countryCode":"MHL","countryName":"Marshall Islands"},{"countryCode":"MKD","countryName":"Macedonia"},{"countryCode":"MLI","countryName":"Mali"},{"countryCode":"MLT","countryName":"Malta"},{"countryCode":"MMR","countryName":"Myanmar"},{"countryCode":"MNG","countryName":"Mongolia"},{"countryCode":"MOZ","countryName":"Mozambique"},{"countryCode":"MRT","countryName":"Mauritania"},{"countryCode":"MUS","countryName":"Mauritius"},{"countryCode":"MWI","countryName":"Malawi"},{"countryCode":"MYS","countryName":"Malaysia"},{"countryCode":"NAM","countryName":"Namibia"},{"countryCode":"NER","countryName":"Niger"},{"countryCode":"NGA","countryName":"Nigeria"},{"countryCode":"NIC","countryName":"Nicaragua"},{"countryCode":"NLD","countryName":"Netherlands"},{"countryCode":"NOR","countryName":"Norway"},{"countryCode":"NPL","countryName":"Nepal"},{"countryCode":"NRU","countryName":"Nauru"},{"countryCode":"NZL","countryName":"New Zealand"},{"countryCode":"OMN","countryName":"Oman"},{"countryCode":"PAK","countryName":"Pakistan"},{"countryCode":"PAN","countryName":"Panama"},{"countryCode":"PER","countryName":"Peru"},{"countryCode":"PHL","countryName":"Philippines"},{"countryCode":"PLW","countryName":"Palau"},{"countryCode":"PNG","countryName":"Papua New Guinea"},{"countryCode":"POL","countryName":"Poland"},{"countryCode":"PRK","countryName":"North Korea"},{"countryCode":"PRT","countryName":"Portugal"},{"countryCode":"PRY","countryName":"Paraguay"},{"countryCode":"PSE","countryName":"Palestine"},{"countryCode":"QAT","countryName":"Qatar"},{"countryCode":"REP","countryName":"Siem Reap"},{"countryCode":"ROU","countryName":"Romania"},{"countryCode":"RUS","countryName":"Russia"},{"countryCode":"RWA","countryName":"Rwanda"},{"countryCode":"SAU","countryName":"Saudi Arabia"},{"countryCode":"SCG","countryName":"Serbia & Montenegro"},{"countryCode":"SDN","countryName":"Sudan"},{"countryCode":"SEN","countryName":"Senegal"},{"countryCode":"SGP","countryName":"Singapore"},{"countryCode":"SLB","countryName":"Solomon Islands"},{"countryCode":"SLE","countryName":"Sierra Leone"},{"countryCode":"SLV","countryName":"El Salvador"},{"countryCode":"SMR","countryName":"San Marino"},{"countryCode":"SOM","countryName":"Somalia"},{"countryCode":"STP","countryName":"Sao Tome and Principe"},{"countryCode":"SUR","countryName":"Suriname"},{"countryCode":"SVK","countryName":"Slovakia"},{"countryCode":"SVN","countryName":"Slovenia"},{"countryCode":"SWE","countryName":"Sweden"},{"countryCode":"SWZ","countryName":"Swaziland"},{"countryCode":"SYC","countryName":"Seychelles"},{"countryCode":"SYR","countryName":"Syria"},{"countryCode":"TCD","countryName":"Chad"},{"countryCode":"TGO","countryName":"Togo"},{"countryCode":"THA","countryName":"泰国"},{"countryCode":"TJK","countryName":"Tajikistan"},{"countryCode":"TKM","countryName":"Turkmenistan"},{"countryCode":"TLS","countryName":"Timor Leste"},{"countryCode":"TON","countryName":"Tonga"},{"countryCode":"TTO","countryName":"Trinidad and Tobago"},{"countryCode":"TUN","countryName":"Tunisia"},{"countryCode":"TUR","countryName":"Turkey"},{"countryCode":"TUV","countryName":"Tuvalu"},{"countryCode":"TWN","countryName":"China(Taipei)"},{"countryCode":"TZA","countryName":"Tanzania"},{"countryCode":"UGA","countryName":"Uganda"},{"countryCode":"UKR","countryName":"Ukraine"},{"countryCode":"URY","countryName":"Uruguay"},{"countryCode":"USA","countryName":"United States of America"},{"countryCode":"UZB","countryName":"Uzbekistan"},{"countryCode":"VAT","countryName":"Vatican City"},{"countryCode":"VCT","countryName":"Saint Vincent and the Grenadines"},{"countryCode":"VEN","countryName":"Venezuela"},{"countryCode":"VNM","countryName":"Vietnam"},{"countryCode":"VUT","countryName":"Vanuatu"},{"countryCode":"WSM","countryName":"Samoa"},{"countryCode":"YEM","countryName":"Yemen"},{"countryCode":"ZAF","countryName":"South Africa"},{"countryCode":"ZMB","countryName":"Zambia"},{"countryCode":"ZWE","countryName":"Zimbabwe"}]}
        /*GetCountryAreaCodeSearchBean inBean = new GetCountryAreaCodeSearchBean();
        inBean.setLang("zh_cn");
        inBean.setUsernameToken(token);
        GetCountryAreaCodeResultBean rtb = port.getCountryAreaCode(inBean);*/
//
		// 航班查询，按机场查询
        /*SearchFlightsBatchSearchBean inBean = new SearchFlightsBatchSearchBean();
        inBean.setUsernameToken(token);
        inBean.setCodeType(1);
        inBean.setLang("zh_cn");
        inBean.setMoneyClassId(0);
        inBean.setOriCode("PVG");
        inBean.setDestCode("SYX");
        inBean.setDateRangeFlag(1);
        SearchFlightsBatchResultBean rtb = port.searchFlightsBatch(inBean);*/
		// 航班查询，按城市查询(目前不支持)
        /*SearchFlightsBatchSearchBean inBean = new SearchFlightsBatchSearchBean();
        inBean.setUsernameToken(token);
        inBean.setCodeType(2);
        inBean.setLang("zh_cn");
        inBean.setMoneyClassId(0);
        inBean.setOriCode("SHA");
        inBean.setDestCode("SYX");
        inBean.setDateRangeFlag(1);
        SearchFlightsBatchResultBean rtb = port.searchFlightsBatch(inBean);*/
		// 根据航段ID查询航班
		/*SearchFlightsBySegIdBean inBean = new SearchFlightsBySegIdBean();
		inBean.setLang("en_us");
		inBean.setUsernameToken(token);
		inBean.setMoneyClassId(0);
		// inBean.setSegmentHeadId("708463");
		inBean.setSegmentHeadId("708468");
		SearchFlightsBatchResultBean2 rtb = port.searchFlightsBySegId2(inBean);*/
// 客规总描述信息查询
		/*GetKeguiTotalDescriptionInputBean inBean = new GetKeguiTotalDescriptionInputBean();
		inBean.setLang("en_us");
		inBean.setUsernameToken(token);
		inBean.setSegmentHeadId(708469l);
		inBean.setSeatType("1");
		inBean.setCabin("Y");// TODO 不填的情况下返回结果中的客规描述为null
		GetKeguiTotalDescriptionResultBean rtb = port.getKeguiTotalDescription2(inBean);
		System.out.println("desc:::::" + rtb.getKeguiDesctiption());*/

		// 查询航班活动舱（不用理会）
//        SearchBeanOfSearchFlightsSP inBean = new SearchBeanOfSearchFlightsSP();
//        inBean.setUsernameToken(token);
////        inBean.setOriCityCode("SHA");
////        inBean.setDestCityCode("SYX");
////		inBean.setOriAirportCode("PVG");
////		inBean.setDestAirportCode("SYX");
//		inBean.setFlightDateBegin("2017-11-25");
//        inBean.setFlightDateEnd("2017-11-30");
//        inBean.setMoneyClassId(0);
//        inBean.setLang("zh_cn");
////        inBean.setSearchFlag(2);
//        SearchFlightsBatchResultBean rtb = port.searchFlightsBatchSP(inBean);

		ObjectMapper o = new ObjectMapper();
		try {
			System.out.println(o.writeValueAsString(inBean));
			System.out.println(o.writeValueAsString(rtb));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
