package com.example.olx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.olx.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.menu_home)
                {
                    showHomeFragment();
                    return true;
                }
                else if (itemId == R.id.menu_chat){
                    showChatFragment();
                    return true;
                }
                else if (itemId == R.id.menu_account){
                    showAccountFragment();
                    return true;
                }
                else if (itemId == R.id.menu_fav){
                    showFabFragment();
                    return true;
                }
                else {
                    return false;
                }
            }
        });
    }

    private void showHomeFragment(){
        binding.toolbarTitleTv.setText("Home");

        HomeFragment fragment = new HomeFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(binding.frameLayout.getId(),fragment,"HomeFragment");
        fragmentTransaction.commit();
   }
    private void showChatFragment(){
        binding.toolbarTitleTv.setText("Chat");
        ChatFragment fragment = new ChatFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(binding.frameLayout.getId(),fragment,"ChatFragment");
        fragmentTransaction.commit();

    }
    private void showFabFragment(){
        binding.toolbarTitleTv.setText("My Ads");
        FabFragment fragment = new FabFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(binding.frameLayout.getId(),fragment,"FabFragment");
        fragmentTransaction.commit();

    }
    private void showAccountFragment(){
        binding.toolbarTitleTv.setText("Account");
        AccountFragment fragment = new AccountFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(binding.frameLayout.getId(),fragment,"AccountFragment");
        fragmentTransaction.commit();

    }
}