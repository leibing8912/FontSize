package cn.jianke.fontsize;

import android.app.Application;

public class BaseApplication extends Application {
	private static BaseApplication mInstance;

	@Override
	public void onCreate() {
		super.onCreate();
		mInstance = this;

	}

	public synchronized static BaseApplication getInstance(){
		if (null == mInstance) {
			mInstance = new BaseApplication();
		}
		return mInstance;
	}
}
