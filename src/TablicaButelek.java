public class TablicaButelek
{
    Butelka[] tablicaButelek;

    TablicaButelek (int iloscButelek, double pojemnoscButelek)
    {
        tablicaButelek = new Butelka[iloscButelek];

        for (int i=0 ; i<tablicaButelek.length ; i++)
        {
           tablicaButelek[i] = new Butelka(pojemnoscButelek, pojemnoscButelek);
            System.out.println("Sworzono butelkę "+i+" o pojemności: "+pojemnoscButelek+" litra i zapełnieniu: "+tablicaButelek[i].napelnienie+" litra");
        }
    }
}
