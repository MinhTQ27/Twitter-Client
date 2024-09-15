package com.example.tablayout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

public class SearchFragment extends Fragment {

private View view;
private ViewPager viewPager;
private TabLayout tabLayoutTop;

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_search, container, false);

    tabLayoutTop = view.findViewById(R.id.tab_layout_top);
    viewPager = view.findViewById(R.id.search_view_pager);

    SearchViewPagerAdapter adapter = new SearchViewPagerAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    viewPager.setAdapter(adapter);

    tabLayoutTop.setupWithViewPager(viewPager);
    return view;
}
}