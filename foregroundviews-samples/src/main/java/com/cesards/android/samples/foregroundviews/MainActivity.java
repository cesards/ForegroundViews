package com.cesards.android.samples.foregroundviews;/*
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

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.inject(this);
  }

  @OnClick({R.id.linears, R.id.relatives, R.id.texts, R.id.images}) public void onItemClick(View v) {
    switch (v.getId()) {
      case R.id.linears:
        startActivity(new Intent(this, LinearsActivity.class));
        break;
      case R.id.relatives:
        startActivity(new Intent(this, RelativesActivity.class));
        break;
      case R.id.texts:
        break;
      case R.id.images:
        break;
    }
  }



}
