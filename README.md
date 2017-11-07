# FragmentTools #
##本库是基于Activity和Fragment开发的快速框架库 ##
## 主要为"单Activity ＋ 多Fragment","多模块Activity + 多Fragment"架构而生，简化开发，轻松解决动画、嵌套、事务相关等问题。 ##
# --- 特性 ---

1、可以快速开发出各种嵌套设计的Fragment App

2、增加启动模式、startForResult等类似Activity方法

3、类似Android事件分发机制的Fragment回退方法：onBackPressedSupport()，轻松为每个Fragment实现Back按键事件

4、提供onSupportVisible()等生命周期方法，简化嵌套Fragment的开发过程； 提供统一的onLazyInitView()懒加载方法

5、提供 Fragment转场动画 系列解决方案，动态更换动画

# --- 使用 --- #
### 第一步： ###
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

### 第二步：
    dependencies {
            
	        compile 'com.github.Edwardwmd:FragmentTools:v1.0.0'
	}

### 第三步 Activity继承SupportActivity：
    public class MainActivity extends SupportActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(...);
        
        if (findFragment(HomeFragment.class) == null) {
            loadRootFragment(R.id.fl_container, HomeFragment.newInstance());  // 加载根Fragment
        }
    }

### Fragment继承SupportFragment：
    public class HomeFragment extends SupportFragment {

    private void xxx() {
        // 启动新的Fragment, 另有start(fragment,SINGTASK)、startForResult、startWithPop等启动方法
        start(DetailFragment.newInstance(HomeBean));
        // ... 其他pop, find, 设置动画等等API, 请自行查看WIKI
      }
    }

