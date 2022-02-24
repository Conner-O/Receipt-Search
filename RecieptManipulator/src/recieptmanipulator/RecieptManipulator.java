/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recieptmanipulator;

import java.io.*;

/**
 *
 * @author Conner
 */
public class RecieptManipulator {

    public static void main(String[] args) throws IOException {
        // create instance of directory 
        File dir = new File("C:\\Users\\Conner\\OneDrive - Iowa State University\\Documents\\Work\\Receipt Journals\\Receipt Journal\\Receipt Journal");

        // create obejct of PrintWriter for output file 
        PrintWriter pw = new PrintWriter("output.txt");

        // Get list of all the files in form of String Array 
        String[] fileNames = dir.list();

        // loop for reading the contents of all the files  
        // in the directory GeeksForGeeks 
        for (String fileName : fileNames) {
            System.out.println("Reading from " + fileName);

            // create instance of file from Name of  
            // the file stored in string Array 
            File f = new File(dir, fileName);

            // create object of BufferedReader 
            BufferedReader br = new BufferedReader(new FileReader(f));
            pw.println("Contents of file " + fileName);

            // Read from current file 
            String line = br.readLine();
            while (line != null) {
                // write to the output file 
                if (line.contains("1827:") || line.contains("1828:") || line.contains(" 9249:")
                        || line.contains(" 2296:")
                        || line.contains(" 2297:")
                        || line.contains(" 2366:")
                        || line.contains(" 2399:")
                        || line.contains(" 2724:")
                        || line.contains(" 2843:")
                        || line.contains(" 2987:")
                        || line.contains(" 2988:")
                        || line.contains(" 9584:")
                        || line.contains(" 9619:")
                        || line.contains(" 9732:")
                        || line.contains(" 54:")
                        || line.contains(" 3963:")
                        || line.contains(" 86:")
                        || line.contains(" 4085:")
                        || line.contains(" 4282:")
                        || line.contains(" 9792:")
                        || line.contains(" 9824:")
                        || line.contains(" 3412:")
                        || line.contains(" 9874:")
                        || line.contains(" 3487:")
                        || line.contains(" 3542:")
                        || line.contains(" 4459:")
                        || line.contains(" 4523:")
                        || line.contains(" 4570:")
                        || line.contains(" 4579:")
                        || line.contains(" 417:")
                        || line.contains(" 4620:")
                        || line.contains(" 4632:")
                        || line.contains(" 4709:")
                        || line.contains(" 4710:")
                        || line.contains(" 4711:")
                        || line.contains(" 4731:")
                        || line.contains(" 4827:")
                        || line.contains(" 4871:")
                        || line.contains(" 4883:")
                        || line.contains(" 4895:")
                        || line.contains(" 4902:")
                        || line.contains(" 4906:")
                        || line.contains(" 4908:")
                        || line.contains(" 4909:")
                        || line.contains(" 4910:")
                        || line.contains(" 4911:")
                        || line.contains(" 4912:")
                        || line.contains(" 4913:")
                        || line.contains(" 4914:")
                        || line.contains(" 4915:")
                        || line.contains(" 4916:")
                        || line.contains(" 4917:")
                        || line.contains(" 4922:")
                        || line.contains(" 4923:")
                        || line.contains(" 4924:")
                        || line.contains(" 4925:")
                        || line.contains(" 4926:")
                        || line.contains(" 570:")
                        || line.contains(" 577:")
                        || line.contains(" 582:")
                        || line.contains(" 588:")
                        || line.contains(" 589:")
                        || line.contains(" 590:")
                        || line.contains(" 592:")
                        || line.contains(" 594:")
                        || line.contains(" 595:")
                        || line.contains(" 596:")
                        || line.contains(" 600:")
                        || line.contains(" 4930:")
                        || line.contains(" 4931:")
                        || line.contains(" 4932:")
                        || line.contains(" 4933:")
                        || line.contains(" 4934:")
                        || line.contains(" 4935:")
                        || line.contains(" 4937:")
                        || line.contains(" 4939:")
                        || line.contains(" 4940:")
                        || line.contains(" 4942:")
                        || line.contains(" 4943:")
                        || line.contains(" 4944:")
                        || line.contains(" 4945:")
                        || line.contains(" 4953:")
                        || line.contains(" 4957:")
                        || line.contains(" 4958:")
                        || line.contains(" 4959:")
                        || line.contains(" 4960:")
                        || line.contains(" 4961:")
                        || line.contains(" 4962:")
                        || line.contains(" 4963:")
                        || line.contains(" 4967:")
                        || line.contains(" 4969:")
                        || line.contains(" 4972:")
                        || line.contains(" 4974:")
                        || line.contains(" 4976:")
                        || line.contains(" 4977:")
                        || line.contains(" 4996:")
                        || line.contains(" 4997:")
                        || line.contains(" 609:")
                        || line.contains(" 610:")
                        || line.contains(" 619:")
                        || line.contains(" 620:")
                        || line.contains(" 621:")
                        || line.contains(" 5021:")
                        || line.contains(" 5061:")
                        || line.contains(" 5063:")
                        || line.contains(" 5062:")
                        || line.contains(" 645:")
                        || line.contains(" 656:")
                        || line.contains(" 5084:")
                        || line.contains(" 5109:")
                        || line.contains(" 5110:")
                        || line.contains(" 5159:")
                        || line.contains(" 5160:")
                        || line.contains(" 5172:")
                        || line.contains(" 5173:")
                        || line.contains(" 5174:")
                        || line.contains(" 5175:")
                        || line.contains(" 5185:")
                        || line.contains(" 5189:")
                        || line.contains(" 709:")
                        || line.contains(" 712:")
                        || line.contains(" 745:")
                        || line.contains(" 749:")
                        || line.contains(" 5208:")
                        || line.contains(" 5211:")
                        || line.contains(" 5221:")
                        || line.contains(" 5223:")
                        || line.contains(" 5224:")
                        || line.contains(" 5247:")
                        || line.contains(" 767:")
                        || line.contains(" 777:")
                        || line.contains(" 784:")
                        || line.contains(" 785:")
                        || line.contains(" 786:")
                        || line.contains(" 5655:")
                        || line.contains(" 5659:")
                        || line.contains(" 5660:")
                        || line.contains(" 5661:")
                        || line.contains(" 5663:")
                        || line.contains(" 5677:")
                        || line.contains(" 5687:")
                        || line.contains(" 5697:")
                        || line.contains(" 5700:")
                        || line.contains(" 5705:")
                        || line.contains(" 5729:")
                        || line.contains(" 1042:")
                        || line.contains(" 1045:")
                        || line.contains(" 1046:")
                        || line.contains(" 1047:")
                        || line.contains(" 1048:")
                        || line.contains(" 1049:")
                        || line.contains(" 1050:")
                        || line.contains(" 1051:")
                        || line.contains(" 1052:")
                        || line.contains(" 1053:")
                        || line.contains(" 1063:")
                        || line.contains(" 5732:")
                        || line.contains(" 5748:")
                        || line.contains(" 5758:")
                        || line.contains(" 5766:")
                        || line.contains(" 5785:")
                        || line.contains(" 5789:")
                        || line.contains(" 5790:")
                        || line.contains(" 5794:")
                        || line.contains(" 5795:")
                        || line.contains(" 5796:")
                        || line.contains(" 5798:")
                        || line.contains(" 5799:")
                        || line.contains(" 1081:")
                        || line.contains(" 5804:")
                        || line.contains(" 5805:")
                        || line.contains(" 5838:")
                        || line.contains(" 5848:")
                        || line.contains(" 5849:")
                        || line.contains(" 5850:")
                        || line.contains(" 5852:")
                        || line.contains(" 5859:")
                        || line.contains(" 5876:")
                        || line.contains(" 1104:")
                        || line.contains(" 1105:")
                        || line.contains(" 1108:")
                        || line.contains(" 1131:")
                        || line.contains(" 1146:")
                        || line.contains(" 5945:")
                        || line.contains(" 5959:")
                        || line.contains(" 1162:")
                        || line.contains(" 1164:")
                        || line.contains(" 1165:")
                        || line.contains(" 1166:")
                        || line.contains(" 1167:")
                        || line.contains(" 1168:")
                        || line.contains(" 1170:")
                        || line.contains(" 1182:")
                        || line.contains(" 1183:")
                        || line.contains(" 1184:")
                        || line.contains(" 1185:")
                        || line.contains(" 1206:")
                        || line.contains(" 6002:")
                        || line.contains(" 6005:")
                        || line.contains(" 6027:")
                        || line.contains(" 6028:")
                        || line.contains(" 6032:")
                        || line.contains(" 6033:")
                        || line.contains(" 6034:")
                        || line.contains(" 6035:")
                        || line.contains(" 6041:")
                        || line.contains(" 6045:")
                        || line.contains(" 6048:")
                        || line.contains(" 1213:")
                        || line.contains(" 1285:")
                        || line.contains(" 1286:")
                        || line.contains(" 1287:")
                        || line.contains(" 1288:")
                        || line.contains(" 1291:")
                        || line.contains(" 1301:")
                        || line.contains(" 1306:")
                        || line.contains(" 6111:")
                        || line.contains(" 6125:")
                        || line.contains(" 6126:")
                        || line.contains(" 6127:")
                        || line.contains(" 6128:")
                        || line.contains(" 6134:")
                        || line.contains(" 6140:")
                        || line.contains(" 6142:")
                        || line.contains(" 6143:")
                        || line.contains(" 6189:")
                        || line.contains(" 1317:")
                        || line.contains(" 1318:")
                        || line.contains(" 1321:")
                        || line.contains(" 1322:")
                        || line.contains(" 1327:")
                        || line.contains(" 1335:")
                        || line.contains(" 1339:")
                        || line.contains(" 1342:")
                        || line.contains(" 1359:")
                        || line.contains(" 1361:")
                        || line.contains(" 1368:")
                        || line.contains(" 6211:")
                        || line.contains(" 6212:")
                        || line.contains(" 6225:")
                        || line.contains(" 6227:")
                        || line.contains(" 6245:")
                        || line.contains(" 1388:")
                        || line.contains(" 1415:")
                        || line.contains(" 1419:")
                        || line.contains(" 6264:")
                        || line.contains(" 6296:")
                        || line.contains(" 6298:")
                        || line.contains(" 6313:")
                        || line.contains(" 6326:")
                        || line.contains(" 6331:")
                        || line.contains(" 6332:")
                        || line.contains(" 1430:")
                        || line.contains(" 1432:")
                        || line.contains(" 1453:")
                        || line.contains(" 1469:")
                        || line.contains(" 6360:")
                        || line.contains(" 6367:")
                        || line.contains(" 6381:")
                        || line.contains(" 6387:")
                        || line.contains(" 6388:")
                        || line.contains(" 6390:")
                        || line.contains(" 6393:")
                        || line.contains(" 6394:")
                        || line.contains(" 6395:")
                        || line.contains(" 6396:")
                        || line.contains(" 6397:")
                        || line.contains(" 1490:")
                        || line.contains(" 1491:")
                        || line.contains(" 1493:")
                        || line.contains(" 5252:")
                        || line.contains(" 5270:")
                        || line.contains(" 5275:")
                        || line.contains(" 5280:")
                        || line.contains(" 5290:")
                        || line.contains(" 5294:")
                        || line.contains(" 5301:")
                        || line.contains(" 5306:")
                        || line.contains(" 5313:")
                        || line.contains(" 5321:")
                        || line.contains(" 5325:")
                        || line.contains(" 801:")
                        || line.contains(" 802:")
                        || line.contains(" 824:")
                        || line.contains(" 830:")
                        || line.contains(" 5337:")
                        || line.contains(" 5338:")
                        || line.contains(" 5339:")
                        || line.contains(" 5342:")
                        || line.contains(" 5343:")
                        || line.contains(" 5344:")
                        || line.contains(" 5345:")
                        || line.contains(" 5346:")
                        || line.contains(" 5347:")
                        || line.contains(" 5349:")
                        || line.contains(" 5351:")
                        || line.contains(" 5353:")
                        || line.contains(" 5354:")
                        || line.contains(" 5358:")
                        || line.contains(" 5359:")
                        || line.contains(" 5365:")
                        || line.contains(" 5366:")
                        || line.contains(" 5376:")
                        || line.contains(" 5383:")
                        || line.contains(" 842:")
                        || line.contains(" 843:")
                        || line.contains(" 844:")
                        || line.contains(" 845:")
                        || line.contains(" 846:")
                        || line.contains(" 851:")
                        || line.contains(" 855:")
                        || line.contains(" 856:")
                        || line.contains(" 857:")
                        || line.contains(" 858:")
                        || line.contains(" 860:")
                        || line.contains(" 861:")
                        || line.contains(" 874:")
                        || line.contains(" 875:")
                        || line.contains(" 5454:")
                        || line.contains(" 5466:")
                        || line.contains(" 5485:")
                        || line.contains(" 5486:")
                        || line.contains(" 5487:")
                        || line.contains(" 5488:")
                        || line.contains(" 881:")
                        || line.contains(" 888:")
                        || line.contains(" 899:")
                        || line.contains(" 900:")
                        || line.contains(" 902:")
                        || line.contains(" 914:")
                        || line.contains(" 928:")
                        || line.contains(" 5507:")
                        || line.contains(" 5529:")
                        || line.contains(" 5556:")
                        || line.contains(" 5559:")
                        || line.contains(" 5569:")
                        || line.contains(" 5571:")
                        || line.contains(" 5572:")
                        || line.contains(" 5573:")
                        || line.contains(" 5574:")
                        || line.contains(" 5575:")
                        || line.contains(" 5576:")
                        || line.contains(" 933:")
                        || line.contains(" 934:")
                        || line.contains(" 936:")
                        || line.contains(" 948:")
                        || line.contains(" 951:")
                        || line.contains(" 952:")
                        || line.contains(" 954:")
                        || line.contains(" 967:")
                        || line.contains(" 970:")
                        || line.contains(" 971:")
                        || line.contains(" 973:")
                        || line.contains(" 976:")
                        || line.contains(" 977:")
                        || line.contains(" 978:")
                        || line.contains(" 979:")
                        || line.contains(" 980:")
                        || line.contains(" 982:")
                        || line.contains(" 983:")
                        || line.contains(" 984:")
                        || line.contains(" 985:")
                        || line.contains(" 987:")
                        || line.contains(" 994:")
                        || line.contains(" 995:")
                        || line.contains(" 998:")
                        || line.contains(" 999:")
                        || line.contains(" 5583:")
                        || line.contains(" 5588:")
                        || line.contains(" 5592:")
                        || line.contains(" 5615:")
                        || line.contains(" 5617:")
                        || line.contains(" 5631:")
                        || line.contains(" 5645:")
                        || line.contains(" 1023:")
                        || line.contains(" 6680:")
                        || line.contains(" 6703:")
                        || line.contains(" 6704:")
                        || line.contains(" 6706:")
                        || line.contains(" 6707:")
                        || line.contains(" 6709:")
                        || line.contains(" 6719:")
                        || line.contains(" 6720:")
                        || line.contains(" 6728:")
                        || line.contains(" 6730:")
                        || line.contains(" 1795:")
                        || line.contains(" 1811:")
                        || line.contains(" 1815:")
                        || line.contains(" 1822:")
                        || line.contains(" 1825:")
                        || line.contains(" 1826:")
                        || line.contains(" 1827:")
                        || line.contains(" 6431:")
                        || line.contains(" 6463:")
                        || line.contains(" 1502:")
                        || line.contains(" 1513:")
                        || line.contains(" 1515:")
                        || line.contains(" 1518:")
                        || line.contains(" 1532:")
                        || line.contains(" 6490:")
                        || line.contains(" 6491:")
                        || line.contains(" 6492:")
                        || line.contains(" 6493:")
                        || line.contains(" 6506:")
                        || line.contains(" 6507:")
                        || line.contains(" 6508:")
                        || line.contains(" 6510:")
                        || line.contains(" 6511:")
                        || line.contains(" 6525:")
                        || line.contains(" 1564:")
                        || line.contains(" 1566:")
                        || line.contains(" 1575:")
                        || line.contains(" 1586:")
                        || line.contains(" 1594:")
                        || line.contains(" 1598:")
                        || line.contains(" 1604:")
                        || line.contains(" 1607:")
                        || line.contains(" 1621:")
                        || line.contains(" 1625:")
                        || line.contains(" 1632:")
                        || line.contains(" 1652:")
                        || line.contains(" 6536:")
                        || line.contains(" 1634:")
                        || line.contains(" 6538:")
                        || line.contains(" 6570:")
                        || line.contains(" 1660:")
                        || line.contains(" 1671:")
                        || line.contains(" 1688:")
                        || line.contains(" 1687:")
                        || line.contains(" 1704:")
                        || line.contains(" 6601:")
                        || line.contains(" 6606:")
                        || line.contains(" 6618:")
                        || line.contains(" 6619:")
                        || line.contains(" 6620:")
                        || line.contains(" 6649:")
                        || line.contains(" 6650:")
                        || line.contains(" 6651:")
                        || line.contains(" 6657:")
                        || line.contains(" 1754:")
                        || line.contains(" 1756:")
                        || line.contains(" 1777:")
                        || line.contains(" 1780:")
                        || line.contains(" 6761:")
                        || line.contains(" 6767:")
                        || line.contains(" 6788:")
                        || line.contains(" 6790:")
                        || line.contains(" 6801:")
                        || line.contains(" 6804:")
                        || line.contains(" 1843:")) {
                    pw.println(line.substring(16));
                    line = br.readLine();
                } else {
                    line = br.readLine();
                }
            }
            pw.flush();
        }
        System.out.println("Reading from all files"
                + " in directory " + dir.getName() + " Completed");
    }
}
