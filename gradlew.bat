<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".ThreeActivity">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="540dp"
        android:text="第三方数据提示"
        android:textSize="30dp"
        android:id="@+id/ok"
        />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_marginTop="10dp"

        >
        <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="天气预报"
            android:layout_weight="1"
            android:id="@+id/weather"
            />

        <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="今日油价"
            android:layout_weight="1"
            android:id="@+id/oil"
            />
        <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="新闻头条"
            android:layout_weight="1"
            android:id="@+id/news"
            />
    </LinearLayout>
</LinearLayout>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           