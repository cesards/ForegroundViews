/*
 * Copyright 2014 DogmaLabs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dogmalabs.foregroundviews.sample;

import android.widget.ArrayAdapter;

public class RelativesActivity extends ListActivity {

    @Override
    protected void setInitialData() {
        listView.setAdapter(new ArrayAdapter<String>(this, R.layout.row_relative_item, android.R.id.text1, titles));
    }

}
