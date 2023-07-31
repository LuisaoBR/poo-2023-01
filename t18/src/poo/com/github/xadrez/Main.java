package poo.com.github.xadrez;

public class Main {

	public static void main(String[] args) {

		// Instanciar jogadores

		Jogador jogador1 = new Jogador("Adolf Anderssen", "Branca");
		Jogador jogador2 = new Jogador("Lionel Kieseritzky", "Pretas");

		// Instanciar peças

		Peca cavalo1Branco = new Peca("Cavalo 1", "Branco");
		Peca cavalo2Branco = new Peca("Cavalo 2", "Branco");
		Peca torre1Branco = new Peca("Torre 1", "Branco");
		Peca torre2Branco = new Peca("Torre 2", "Branco");
		Peca bispo1Branco = new Peca("Bispo 1", "Branco");
		Peca bispo2Branco = new Peca("Bispo 2", "Branco");
		Peca reiBranco = new Peca("Rei", "Branco");
		Peca rainhaBranco = new Peca("Rainha", "Branco");
		Peca peao1Branco = new Peca("Peao 1", "Branco");
		Peca peao2Branco = new Peca("Peao 2", "Branco");
		Peca peao3Branco = new Peca("Peao 3", "Branco");
		Peca peao4Branco = new Peca("Peao 4", "Branco");
		Peca peao5Branco = new Peca("Peao 5", "Branco");
		Peca peao6Branco = new Peca("Peao 6", "Branco");
		Peca peao7Branco = new Peca("Peao 7", "Branco");
		Peca peao8Branco = new Peca("Peao 8", "Branco");

		Peca cavalo1Preto = new Peca("Cavalo 1", "Preto");
		Peca cavalo2Preto = new Peca("Cavalo 2", "Preto");
		Peca torre1Preto = new Peca("Torre 1", "Preto");
		Peca torre2Preto = new Peca("Torre 2", "Preto");
		Peca bispo1Preto = new Peca("Bispo 1", "Preto");
		Peca bispo2Preto = new Peca("Bispo 2", "Preto");
		Peca reiPreto = new Peca("Rei", "Preto");
		Peca rainhaPreto = new Peca("Rainha", "Preto");
		Peca peao1Preto = new Peca("Peao 1", "Preto");
		Peca peao2Preto = new Peca("Peao 2", "Preto");
		Peca peao3Preto = new Peca("Peao 3", "Preto");
		Peca peao4Preto = new Peca("Peao 4", "Preto");
		Peca peao5Preto = new Peca("Peao 5", "Preto");
		Peca peao6Preto = new Peca("Peao 6", "Preto");
		Peca peao7Preto = new Peca("Peao 7", "Preto");
		Peca peao8Preto = new Peca("Peao 8", "Preto");

		// Instanciar posições das peças

		Posicao p1 = new Posicao("c", 4, false);
		Posicao p2 = new Posicao("f", 1, true);

		Posicao p3 = new Posicao("e", 4, false);
		Posicao p4 = new Posicao("e", 2, true);

		Posicao p5 = new Posicao("f", 1, false);
		Posicao p6 = new Posicao("e", 1, true);

		Posicao p7 = new Posicao("h", 4, false);
		Posicao p8 = new Posicao("d", 8, true);

		Posicao p9 = new Posicao("f", 4, false);
		Posicao p10 = new Posicao("f", 6, true);

		Posicao p11 = new Posicao("b", 5, false);
		Posicao p12 = new Posicao("b", 6, true);

		// 2

		Posicao p13 = new Posicao("b", 5, false);
		Posicao p14 = new Posicao("c", 4, true);

		Posicao p15 = new Posicao("f", 5, false);
		Posicao p16 = new Posicao("g", 1, true);

		Posicao p17 = new Posicao("g", 1, false);
		Posicao p18 = new Posicao("h", 1, true);

		Posicao p19 = new Posicao("d", 3, false);
		Posicao p20 = new Posicao("d", 2, true);

		Posicao p21 = new Posicao("g", 4, false);
		Posicao p22 = new Posicao("g", 2, true);

		Posicao p23 = new Posicao("f", 6, false);
		Posicao p24 = new Posicao("g", 8, true);

		Posicao p25 = new Posicao("g", 5, false);
		Posicao p26 = new Posicao("h", 4, true);

		Posicao p27 = new Posicao("c", 6, false);
		Posicao p28 = new Posicao("c", 7, true);

		// 3

		Posicao p29 = new Posicao("d", 5, false);
		Posicao p30 = new Posicao("b", 1, true);

		Posicao p31 = new Posicao("f", 3, false);
		Posicao p32 = new Posicao("d", 1, true);

		Posicao p33 = new Posicao("f", 4, false);
		Posicao p34 = new Posicao("c", 1, true);

		Posicao p35 = new Posicao("h", 5, false);
		Posicao p36 = new Posicao("h", 2, true);

		Posicao p37 = new Posicao("b", 2, false);
		Posicao p38 = new Posicao("g", 5, true);

		Posicao p39 = new Posicao("c", 5, false);
		Posicao p40 = new Posicao("f", 8, true);

		Posicao p41 = new Posicao("b", 5, false);
		Posicao p42 = new Posicao("c", 6, true);

		// 4

		Posicao p43 = new Posicao("e", 2, false);
		Posicao p44 = new Posicao("f", 1, true);

		Posicao p45 = new Posicao("f", 6, false);
		Posicao p46 = new Posicao("f", 3, true);

		Posicao p47 = new Posicao("g", 7, false);
		Posicao p48 = new Posicao("f", 5, true);

		Posicao p49 = new Posicao("d", 6, false);
		Posicao p50 = new Posicao("f", 4, true);

		Posicao p51 = new Posicao("e", 5, false);
		Posicao p52 = new Posicao("e", 4, true);

		Posicao p53 = new Posicao("a", 1, false);
		Posicao p54 = new Posicao("b", 2, true);

		Posicao p55 = new Posicao("g", 1, false);
		Posicao p56 = new Posicao("c", 5, true);

		Posicao p57 = new Posicao("a", 6, false);
		Posicao p58 = new Posicao("b", 8, true);

		Posicao p59 = new Posicao("d", 8, false);
		Posicao p60 = new Posicao("e", 8, true);

		// Instanciar lances

		Lance l1 = new Lance(jogador1, bispo2Branco, p1, p2);
		Lance l2 = new Lance(jogador1, peao5Branco, p3, p4);
		Lance l3 = new Lance(jogador1, reiBranco, p5, p6);
		Lance l4 = new Lance(jogador2, rainhaPreto, p7, p8);
		Lance l5 = new Lance(jogador2, peao6Preto, p9, p10);
		Lance l6 = new Lance(jogador2, peao2Preto, p11, p12);

		Lance l7 = new Lance(jogador1, bispo2Branco, p13, p14);
		Lance l8 = new Lance(jogador1, cavalo2Branco, p15, p16);
		Lance l9 = new Lance(jogador1, torre2Branco, p17, p18);
		Lance l10 = new Lance(jogador1, peao4Branco, p19, p20);
		Lance l11 = new Lance(jogador1, peao7Branco, p21, p22);
		Lance l12 = new Lance(jogador2, cavalo2Preto, p23, p24);
		Lance l13 = new Lance(jogador2, rainhaPreto, p25, p26);
		Lance l14 = new Lance(jogador2, peao3Preto, p27, p28);

		Lance l15 = new Lance(jogador1, cavalo1Branco, p29, p30);
		Lance l16 = new Lance(jogador1, rainhaBranco, p31, p32);
		Lance l17 = new Lance(jogador1, bispo1Branco, p33, p34);
		Lance l18 = new Lance(jogador1, peao8Branco, p35, p36);
		Lance l19 = new Lance(jogador2, rainhaPreto, p37, p38);
		Lance l20 = new Lance(jogador2, bispo2Preto, p39, p40);
		Lance l21 = new Lance(jogador2, peao2Preto, p41, p42);

		Lance l22 = new Lance(jogador1, reiBranco, p43, p44);
		Lance l23 = new Lance(jogador1, rainhaBranco, p45, p46);
		Lance l24 = new Lance(jogador1, cavalo2Branco, p47, p48);
		Lance l25 = new Lance(jogador1, bispo2Branco, p49, p50);
		Lance l27 = new Lance(jogador1, peao5Branco, p51, p52);
		Lance l28 = new Lance(jogador2, rainhaPreto, p53, p54);
		Lance l29 = new Lance(jogador2, bispo2Preto, p55, p56);
		Lance l30 = new Lance(jogador2, cavalo1Preto, p57, p58);
		Lance l31 = new Lance(jogador2, reiPreto, p59, p60);

		// Instanciar partida imortal

		Partida partida1 = new Partida("Partida Imortal");

		// Adicionar lances a lista de lances da partida

		partida1.listaLances.add(l1);
		partida1.listaLances.add(l2);
		partida1.listaLances.add(l3);
		partida1.listaLances.add(l4);
		partida1.listaLances.add(l5);
		partida1.listaLances.add(l6);
		partida1.listaLances.add(l7);
		partida1.listaLances.add(l8);
		partida1.listaLances.add(l9);
		partida1.listaLances.add(l10);
		partida1.listaLances.add(l11);
		partida1.listaLances.add(l12);
		partida1.listaLances.add(l13);
		partida1.listaLances.add(l14);
		partida1.listaLances.add(l15);
		partida1.listaLances.add(l16);
		partida1.listaLances.add(l17);
		partida1.listaLances.add(l18);
		partida1.listaLances.add(l19);
		partida1.listaLances.add(l20);
		partida1.listaLances.add(l21);
		partida1.listaLances.add(l22);
		partida1.listaLances.add(l23);
		partida1.listaLances.add(l24);
		partida1.listaLances.add(l25);
		partida1.listaLances.add(l27);
		partida1.listaLances.add(l28);
		partida1.listaLances.add(l29);
		partida1.listaLances.add(l30);
		partida1.listaLances.add(l31);

		// Mostrar dados e lances da partida

		partida1.toString();
		partida1.mostraLances();

	}

}
