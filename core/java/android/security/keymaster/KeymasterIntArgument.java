/**
 * Copyright (c) 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.security.keymaster;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @hide
 */
class KeymasterIntArgument extends KeymasterArgument {
    public final int value;

    public KeymasterIntArgument(int tag, int value) {
        super(tag);
        this.value = value;
    }

    public KeymasterIntArgument(int tag, Parcel in) {
        super(tag);
        value = in.readInt();
    }

    @Override
    public void writeValue(Parcel out) {
        out.writeInt(value);
    }
}
