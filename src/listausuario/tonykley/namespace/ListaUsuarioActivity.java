package listausuario.tonykley.namespace;

import android.os.Bundle;
import org.apache.cordova.DroidGap;

public class ListaUsuarioActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/addUser.html");
    }
}