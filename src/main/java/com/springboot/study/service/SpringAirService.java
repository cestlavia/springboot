package com.springboot.study.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.study.service.saws.*;

import java.util.List;

public class SpringAirService {
	/**
	 * 身份证验证
	 *
	 * @param args
	 */
	/*public static void main(String[] args) {
	    String id = "420432199507019777";
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
		inBean.setSegmentHeadId("708481");
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

		// 计算订单金额（售前）
		/*GetSpecificPriceInputBean inBean = new GetSpecificPriceInputBean();
		inBean.setSegType("N");
		inBean.setLang("zh_cn");
		inBean.setMoneyClassId(0);
		inBean.setUsernameToken(token);
		List<Long> segHeadIds = inBean.getSegHeadIds();
		segHeadIds.add(708470l);
		List<String> cabinNames = inBean.getCabinNames();
		cabinNames.add("R4");
		List<Integer> cabinTypes = inBean.getCabinTypes();
		cabinTypes.add(1);
		GetSpecificPriceResultBean rtb = port.getSpecificPrice(inBean);*/

		// 预定订单
		/*BookOrderBookBean inBean = new BookOrderBookBean();
		inBean.setUsernameToken(token);
		inBean.setLang("zh_cn");
		inBean.setMoneyClassId(0);
		inBean.setLcType("N");
		inBean.setFirstSegId(708471l);
		inBean.setFirstSegAdultCabin("R1");
		inBean.setAdultNum(1);
		inBean.setChildNum(0);
		inBean.setInfantNum(0);
		inBean.setLinkmanName("李刚");
		inBean.setLinkmanWorkTel("13307331433");
		inBean.setRemoteIp("127.0.0.1");
		List<PassengerBookInfo> infos = inBean.getFirstSegPassengerInfo();
		PassengerBookInfo info0 = new PassengerBookInfo();
		PassengerDetailInfo info00 = new PassengerDetailInfo();
		info00.setAge(27);
		info00.setCardTypeId(1);
		info00.setCardNo("410020199801029777");
		info00.setFamilyName("李");
		info00.setPassengerType(1);
		info00.setBirthdate("1990-01-02");
		info0.setPassengerDetailInfo(info00);
		List<InsuranceBookInfo> insuranceInfo = info0.getInsuranceInfo();
		List<XprodBookInfo> xprodInfo = info0.getXprodInfo();
		XprodBookInfo prod = new XprodBookInfo();
		prod.setXprodNum(1);
		prod.setXprodId(25);
		// prod.setAddInfo("1663070");
		xprodInfo.add(prod);
		infos.add(info0);
//		insuranceInfo
//		xprodInfo
		BookOrderResultBean rtb = port.bookOrder(inBean);*/
//		{"errCode":null,"ifSuccess":"Y","orderNo":"QVRJBH","payMoney":450.0}
//		{"errCode":null,"ifSuccess":"Y","orderNo":"QVRJBR","payMoney":450.0}QVRJBU\QVRJBX\QVRJCA\QVRJCD
		// 查询订单明细
		/*GetOrderDetailInfoQueryBean inBean = new GetOrderDetailInfoQueryBean();
		inBean.setLang("zh_cn");
		inBean.setUsernameToken(token);
		inBean.setOrderNo("QVRJBH");
//		inBean.setOrderNo("QVRJCD");
		GetOrderDetailInfoResultBean rtb = port.getOrderDetailInfo(inBean);*/
		// {"errCode":null,"ifSuccess":"Y","orderSumInfo":{"bookTime":"2017-11-23 10:15:11","linkmanName":"李刚","linkmanWorkTel":"13307331233","moneyClassId":0,"orderMoney":450.0,"orderNo":"QVRJBH","payFlag":0},"ticketList":[{"flightBasicInfo":{"acType":"A320","destEndPoint":{"airportCityInfo":{"airportCode":"SYX","airportName":"凤凰","airportTerminal":null,"cityCode":"SYX","cityName":"三亚"},"destTimeInfo":{"localCityCode":"SYX","timeBJ":"2017-11-26 20:00:00","timeLocal":"2017-11-26 20:00:00","timeLocalSys":0},"oriTimeInfo":null},"firstStopover":null,"flightNo":"9C9955","flightStatus":0,"fuelFee":0.0,"oriEndPoint":{"airportCityInfo":{"airportCode":"PVG","airportName":"浦东T2航站楼","airportTerminal":null,"cityCode":"SHA","cityName":"上海"},"destTimeInfo":null,"oriTimeInfo":{"localCityCode":"SHA","timeBJ":"2017-11-26 18:00:00","timeLocal":"2017-11-26 18:00:00","timeLocalSys":0}},"portPay":50.0,"pubPrice":1990.0,"routeAreaFlag":1,"secondStopover":null,"segHeadId":708470},"passengerDetailInfo":{"age":27,"birthdate":"1990-01-02","cardNo":"410020199001029888","cardTypeId":1,"countryOfIssue":null,"familyName":"李","gender":null,"nationality":null,"passengerType":1,"passportExpireDate":null,"personalName":null,"phoneNo":null},"ticketBasicInfo":{"fuelPrice":0.0,"insFee":0.0,"lcHeadId":null,"orderHeadId":109602984,"orderNo":"QVRJBH","otherFy":0.0,"payGateFy":0.0,"portPay":50.0,"seatName":"R4","segHeadId":708470,"tktFlag":2,"tktNo":null,"tktPrice":400.0,"tktType":1,"wfHeadId":109602984,"xprodFee":0.0}}]}
		// {"errCode":null,"ifSuccess":"Y","orderSumInfo":{"bookTime":"2017-11-23 15:22:07","linkmanName":"李刚","linkmanWorkTel":"13307331233","moneyClassId":0,"orderMoney":450.0,"orderNo":"QVRJBR","payFlag":0},"ticketList":[{"flightBasicInfo":{"acType":"A320","destEndPoint":{"airportCityInfo":{"airportCode":"SYX","airportName":"凤凰","airportTerminal":null,"cityCode":"SYX","cityName":"三亚"},"destTimeInfo":{"localCityCode":"SYX","timeBJ":"2017-11-29 20:00:00","timeLocal":"2017-11-29 20:00:00","timeLocalSys":0},"oriTimeInfo":null},"firstStopover":null,"flightNo":"9C9955","flightStatus":0,"fuelFee":0.0,"oriEndPoint":{"airportCityInfo":{"airportCode":"PVG","airportName":"浦东T2航站楼","airportTerminal":null,"cityCode":"SHA","cityName":"上海"},"destTimeInfo":null,"oriTimeInfo":{"localCityCode":"SHA","timeBJ":"2017-11-29 18:00:00","timeLocal":"2017-11-29 18:00:00","timeLocalSys":0}},"portPay":50.0,"pubPrice":1990.0,"routeAreaFlag":1,"secondStopover":null,"segHeadId":708473},"passengerDetailInfo":{"age":27,"birthdate":"1990-01-02","cardNo":"410020199001029888","cardTypeId":1,"countryOfIssue":null,"familyName":"李","gender":null,"nationality":null,"passengerType":1,"passportExpireDate":null,"personalName":null,"phoneNo":null},"ticketBasicInfo":{"fuelPrice":0.0,"insFee":0.0,"lcHeadId":null,"orderHeadId":109602995,"orderNo":"QVRJBR","otherFy":0.0,"payGateFy":0.0,"portPay":50.0,"seatName":"R4","segHeadId":708473,"tktFlag":2,"tktNo":null,"tktPrice":400.0,"tktType":1,"wfHeadId":109602995,"xprodFee":0.0}}]}
		// 查询其他税费明细
		/*GetOtherFyDetailInputBean inBean = new GetOtherFyDetailInputBean();
		inBean.setLang("zh_cn");
		inBean.setUsernameToken(token);
		inBean.setOrderHeadId(109602984l);
		GetOtherFyDetailResultBean rtb = port.getOtherFyDetail(inBean);*/
		// 查询订单汇总信息
		/*GetOrderSumInfoQueryBean inBean = new GetOrderSumInfoQueryBean();
		inBean.setUsernameToken(token);
		inBean.setOrderNo("QVRJBH");
		GetOrderSumInfoResultBean rtb = port.getOrderSumInfo(inBean);*/
//		{"errCode":null,"ifSuccess":"Y","orderSumInfo":{"bookTime":"2017-11-23 10:15:11","linkmanName":"李刚","linkmanWorkTel":"13307331233","moneyClassId":0,"orderMoney":450.0,"orderNo":"QVRJBH","payFlag":0}}
		// 辅助产品售前查询——生成航空订单前
		GetSubProdBySegInputBean inBean = new GetSubProdBySegInputBean();
		inBean.setUsernameToken(token);
		inBean.setLang("zh_cn");
		inBean.setMoneyClassId(0l);
		inBean.setThisSegHeadId(708471l);
		inBean.setThisSegHeadType(1);
		inBean.setAdultTktPrice(720d);
		inBean.setAdultCabinName("R1");
		inBean.setTktType(1);
		List<Long> queryXtypeRange = inBean.getQueryXtypeRange();
		queryXtypeRange.add(1l);
		queryXtypeRange.add(2l);
		queryXtypeRange.add(3l);
		queryXtypeRange.add(4l);
		queryXtypeRange.add(6l);
		queryXtypeRange.add(7l);
		queryXtypeRange.add(8l);
		queryXtypeRange.add(9l);
		queryXtypeRange.add(10l);
		queryXtypeRange.add(12l);
		queryXtypeRange.add(14l);
		GetSubProdBySegResultBean rtb = port.getSubProdBySeg(inBean);

		// 取消订单
		/*CancelOrderInputBean inBean = new CancelOrderInputBean();
		inBean.setUsernameToken(token);
		inBean.setOrderNo("QVRJCD");
		CancelOrderResultBean rtb = port.cancelOrder(inBean);*/
		ObjectMapper o = new ObjectMapper();
		try {
			System.out.println(o.writeValueAsString(inBean));
			System.out.println(o.writeValueAsString(rtb));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
