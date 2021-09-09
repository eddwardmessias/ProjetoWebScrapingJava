package com.example.webscrapingprojetosdelei.scrapper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


import java.io.IOException;
import java.util.List;

public class ScrapperMain {
    public static void main(String[] args) throws IOException {

        String url = "https://sapl.campinagrande.pb.leg.br/materia/pesquisar-materia?tipo=" +
                "4&ementa=&numero=&numeracao__numero_materia=&numero_protocolo=&ano=&o=&tipo_" +
                "listagem=1&tipo_origem_externa=&numero_origem_externa=&ano_origem_externa=&" +
                "data_origem_externa_0=&data_origem_externa_1=&local_origem_externa=&data_" +
                "apresentacao_0=&data_apresentacao_1=&data_publicacao_0=&data_publicacao_1=" +
                "&autoria__autor=&autoria__primeiro_autor=unknown&autoria__autor__tipo=&autoria" +
                "__autor__parlamentar_set__filiacao__partido=&relatoria__parlamentar_id=&em_tramitacao" +
                "=&tramitacao__unidade_tramitacao_destino=&tramitacao__status=&materiaassunto__assunto=&indexacao=";

        // Conectan o Jsoup na url
        Document doc = Jsoup.connect(url).get();

        Element tbody = doc.getElementsByTag("tbody").first();

        List<Element> projetos = tbody.getElementsByClass("dont-break-out");

        List<Element> numeroProjeto = tbody.getElementsContainingOwnText( "PL ");


        for (int i = 0; i < numeroProjeto.size()-1; i++) {
            System.out.println("Projeto de Lei - " + numeroProjeto.get(i).text().substring(3, 12));
            System.out.println(projetos.get(i).text());
        }

    }
}
