/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.books.data;

import android.provider.BaseColumns;

public final class BookContract {

    private BookContract() {
    }

    public static final class BookEntry implements BaseColumns {

        public final static String BOOK_TABLE_NAME = "books";

        public final static String _ID = BaseColumns._ID;

        public final static String BOOK_NAME = "name";

        public final static String BOOK_PRICE = "price";

        public final static String BOOK_PHONE = "phone";

        public final static String BOOK_QUANTITY = "qty";

        public final static String SUPPLIER_NAME = "supname";

    }

}

