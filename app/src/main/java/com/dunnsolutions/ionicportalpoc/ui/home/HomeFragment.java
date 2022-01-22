package com.dunnsolutions.ionicportalpoc.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.dunnsolutions.ionicportalpoc.R;
import com.dunnsolutions.ionicportalpoc.databinding.FragmentHomeBinding;

import io.ionic.portals.Portal;
import io.ionic.portals.PortalFragment;
import io.ionic.portals.PortalManager;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Portal miniApp1 = PortalManager.getPortal("MINI_APP_1");
        PortalFragment miniApp1Fragment = new PortalFragment(miniApp1);

        final FragmentManager fragmentManager = getChildFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.mini_app_1, miniApp1Fragment).commit();

        Portal miniApp2 = PortalManager.getPortal("MINI_APP_2");
        PortalFragment miniApp2Fragment = new PortalFragment(miniApp2);

        fragmentManager.beginTransaction().replace(R.id.mini_app_2, miniApp2Fragment).commit();
        
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}