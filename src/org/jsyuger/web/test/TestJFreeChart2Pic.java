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
        JFreeChart chart=ChartFactory.createPieChart("�������Ʒ�ܹ�����ͼ",getDataset(),true,true,false);
        chart.setTitle(new TextTitle("��Ʒ�ܹ�ͼ",new Font("����",Font.BOLD+Font.ITALIC,20)));
        
         LegendTitle legend=chart.getLegend(0);//����Legend
         legend.setItemFont(new Font("����",Font.BOLD,14));
         PiePlot plot=(PiePlot) chart.getPlot();//����Plot
         plot.setLabelFont(new Font("����",Font.BOLD,16));
         
        OutputStream os = new FileOutputStream("WebRoot/images/chart/company.jpeg");//ͼƬ���ļ���ʽ�ģ���Ҫ�õ�FileOutputStream���������
        ChartUtilities.writeChartAsJPEG(os, chart, 600, 450);
        //ʹ��һ������application�Ĺ����࣬��chartת����JPEG��ʽ��ͼƬ����3�������ǿ�ȣ���4�������Ǹ߶ȡ�
        
        os.close();//�ر������
        System.out.print("okay");
    }

    private static DefaultPieDataset getDataset()
    {
        DefaultPieDataset dpd=new DefaultPieDataset(); //����һ��Ĭ�ϵı�ͼ
        dpd.setValue("Ⱦ����Ʒ", 6);  //��������
        dpd.setValue("�̷���Ʒ", 6);
        dpd.setValue("������Ʒ", 2);
        dpd.setValue("������Ʒ", 4);
        return dpd;
    }
}