package org.jsyuger.web.test;

import java.awt.Font;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;

public class TestJFreeChart2Pic
{
    public static void main(String[] args) throws Exception
    {
        JFreeChart chart=ChartFactory.createPieChart("美发店产品架构数据图",getDataset(),true,true,false);
        chart.setTitle(new TextTitle("产品架构图",new Font("宋体",Font.BOLD+Font.ITALIC,20)));
        
         LegendTitle legend=chart.getLegend(0);//设置Legend
         legend.setItemFont(new Font("宋体",Font.BOLD,14));
         PiePlot plot=(PiePlot) chart.getPlot();//设置Plot
         plot.setLabelFont(new Font("隶书",Font.BOLD,16));
         
        OutputStream os = new FileOutputStream("WebRoot/images/chart/company.jpeg");//图片是文件格式的，故要用到FileOutputStream用来输出。
        ChartUtilities.writeChartAsJPEG(os, chart, 600, 450);
        //使用一个面向application的工具类，将chart转换成JPEG格式的图片。第3个参数是宽度，第4个参数是高度。
        
        os.close();//关闭输出流
        System.out.print("okay");
    }

    private static DefaultPieDataset getDataset()
    {
        DefaultPieDataset dpd=new DefaultPieDataset(); //建立一个默认的饼图
        dpd.setValue("染发产品", 6);  //输入数据
        dpd.setValue("烫发产品", 6);
        dpd.setValue("护发产品", 2);
        dpd.setValue("剪发产品", 4);
        return dpd;
    }
}