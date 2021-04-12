package com.hh.coffeevenues;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.hh.coffeevenues.data.RemoteDataSource;
import com.hh.coffeevenues.data.apis.VenuesAPI;
import com.hh.coffeevenues.data.repositories.VenuesListRepository;
import com.hh.coffeevenues.di.AppModule;
import com.hh.coffeevenues.di.AppModule_ProvideRemoteDataSourceFactory;
import com.hh.coffeevenues.di.AppModule_ProvideVenuesAPIFactory;
import com.hh.coffeevenues.di.AppModule_ProvideVenuesListRepositoryFactory;
import com.hh.coffeevenues.ui.vanuesList.VenuesListFragment;
import com.hh.coffeevenues.ui.vanuesList.VenuesListViewModel_AssistedFactory;
import com.hh.coffeevenues.ui.vanuesList.VenuesListViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMyApplication_HiltComponents_ApplicationC extends MyApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object remoteDataSource = new MemoizedSentinel();

  private volatile Object venuesAPI = new MemoizedSentinel();

  private volatile Provider<VenuesListRepository> provideVenuesListRepositoryProvider;

  private DaggerMyApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private RemoteDataSource getRemoteDataSource() {
    Object local = remoteDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = remoteDataSource;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideRemoteDataSourceFactory.provideRemoteDataSource();
          remoteDataSource = DoubleCheck.reentrantCheck(remoteDataSource, local);
        }
      }
    }
    return (RemoteDataSource) local;
  }

  private VenuesAPI getVenuesAPI() {
    Object local = venuesAPI;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = venuesAPI;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideVenuesAPIFactory.provideVenuesAPI(getRemoteDataSource());
          venuesAPI = DoubleCheck.reentrantCheck(venuesAPI, local);
        }
      }
    }
    return (VenuesAPI) local;
  }

  private VenuesListRepository getVenuesListRepository() {
    return AppModule_ProvideVenuesListRepositoryFactory.provideVenuesListRepository(getVenuesAPI());
  }

  private Provider<VenuesListRepository> getVenuesListRepositoryProvider() {
    Object local = provideVenuesListRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideVenuesListRepositoryProvider = (Provider<VenuesListRepository>) local;
    }
    return (Provider<VenuesListRepository>) local;
  }

  @Override
  public void injectMyApplication(MyApplication myApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public MyApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMyApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MyApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MyApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MyApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MyApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MyApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MyApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<VenuesListViewModel_AssistedFactory> venuesListViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private VenuesListViewModel_AssistedFactory getVenuesListViewModel_AssistedFactory() {
        return VenuesListViewModel_AssistedFactory_Factory.newInstance(DaggerMyApplication_HiltComponents_ApplicationC.this.getVenuesListRepositoryProvider());
      }

      private Provider<VenuesListViewModel_AssistedFactory> getVenuesListViewModel_AssistedFactoryProvider(
          ) {
        Object local = venuesListViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          venuesListViewModel_AssistedFactoryProvider = (Provider<VenuesListViewModel_AssistedFactory>) local;
        }
        return (Provider<VenuesListViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("com.hh.coffeevenues.ui.vanuesList.VenuesListViewModel", (Provider) getVenuesListViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity arg0) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MyApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MyApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectVenuesListFragment(VenuesListFragment arg0) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MyApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MyApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MyApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MyApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MyApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.hh.coffeevenues.ui.vanuesList.VenuesListViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getVenuesListViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MyApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MyApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MyApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.hh.coffeevenues.data.repositories.VenuesListRepository 
        return (T) DaggerMyApplication_HiltComponents_ApplicationC.this.getVenuesListRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
