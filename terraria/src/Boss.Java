package src;

import src.Efeitos.*;
import java.util.ArrayList;

public abstract class Boss extends SerVivo{
    String Ambiente_Spawn;
    int KnockBack_Resist;

    ArrayList<String> imune;
}