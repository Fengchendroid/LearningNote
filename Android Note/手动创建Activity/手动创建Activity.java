/**
 * Created by Fengchendroid on 2018/3/7.
 * 首先打开AndroidStudio,创建项目选择Empty Activity,去掉Generate Layout File和Launcher Activity这两个选项
 * 创建新Activity，并添加public class HelloWorldActivity extends AppCompatActivity代码，重写onCreate()方法
 * 在res目录下创建lxml形式的ayout文件，并用setContentView(R.layout.hello_world_layout);方法将其与Activity关联
 * 最后在AndroidManifest.xml注册Activity，添加
 *  <activity android:name=".HelloWorldActivity">
 *           <intent-filter>
 *              <action android:name="android.intent.action.MAIN" />
 *              <category android:name="android.intent.category.LAUNCHER" />
 *          </intent-filter>
 */
public class HelloWorldActivity extends AppCompatActivity {

    private static final String TAG = "HelloWorldActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        Log.d(TAG, "onCreate execute");
    }

}
/**
 * 布局文件中的相关代码
 */
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/hello_world_layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.helloworld.HelloWorldActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!" />
</RelativeLayout>

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.helloworld">
/**
 * AndroidManifest.xml中的相关代码
 */
    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".HelloWorldActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>