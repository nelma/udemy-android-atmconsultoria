package com.example.atmconsultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atmconstultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {

    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_sobre, container, false);


        String text = "ATM consultoria tem como missão apoiar organizações" +
                " que desejam alcançar o sucesso atráves da excelência" +
                " em gestão da busca pela qualidade";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(text)
                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
                .addWebsite("https://www.google.com", "Acesse nosso site")
                .addGroup("Redes sociais")
                .addFacebook("idFace", "Facebook")
                .addTwitter("idTwiter", "Twitter")
                .addYoutube("idYoutube", "Youtube")
                .addGitHub("nelma", "Github")
                .addPlayStore("com.facebook.katana", "Download App")
                .addItem(versao)
                .create();
    }
}
