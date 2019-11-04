/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGui;

import java.util.LinkedList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import projetoalmanaque.normais.Compra;
import projetoalmanaque.normais.Dívida;

/**
 *
 * @author MarcosB
 */
public class GraficoDeVendas{
    /**
     * Cria um grafico dataset de grafico.
     * @return CategoryDataset
     */
    public CategoryDataset createDataset(){
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        LinkedList<String> datas=new LinkedList<>();
        for(Compra c : MainGui.vendas.compras){
            if(!datas.contains(c.getDatadiv())){
                datas.add(c.getDatadiv());
            }
        }
        for(Dívida c : MainGui.vendas.dividas){
            if(!datas.contains(c.getDatadiv())){
                datas.add(c.getDatadiv());
            }
        }
        for(int i=0;i<datas.size();i++){
            double valor=0;
            for(Compra c : MainGui.vendas.compras){
                if(datas.get(i).equalsIgnoreCase(c.getDatadiv())){
                   valor+=c.getValorDívida();
                }
            }
            for(Dívida c : MainGui.vendas.dividas){
                if(datas.get(i).equalsIgnoreCase(c.getDatadiv())){
                   valor+=c.getValorDívida();
                }
            }
            dataset.addValue(valor, datas.get(i), "");
        }
        return dataset;
    }
    /**
     * Cria o grafico;
     * @param dataset
     * @return JFreeChart
     */
    public JFreeChart createBarChart(CategoryDataset dataset){
        JFreeChart graficoBarra = ChartFactory.createBarChart("Lucros Diarios", "", "Lucro", dataset,PlotOrientation.VERTICAL,true,false,false);
        return graficoBarra;
    }
    /**
     * retorna o grafico pronto para uso.
     * @return ChartPanel
     */
    public ChartPanel criaGrafico(){
        CategoryDataset data = createDataset();
        JFreeChart grafico =createBarChart(data);
        ChartPanel painelGrafico = new ChartPanel(grafico);
        return painelGrafico;
    }
}
