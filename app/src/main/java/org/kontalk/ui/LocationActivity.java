/*
 * Kontalk Android client
 * Copyright (C) 2017 Kontalk Devteam <devteam@kontalk.org>

 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.kontalk.ui;

import android.os.Bundle;

import org.kontalk.R;

/**
 * Location Activity
 * @author andreacappelli
 * @version 1.0
 */

public class LocationActivity extends ToolbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        setupToolbar(true, true);

        LocationFragment fragment = new LocationFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, fragment, fragment.getClass().getName()).commit();
    }

    @Override
    protected boolean isNormalUpNavigation() {
        return true;
    }
}