package com.desiemoji.keyboard.common.ext;

import java.lang.System;

/**
 * Created by Faisal Amir on 04/12/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0001H&\u00a8\u0006\u0005"}, d2 = {"Lcom/desiemoji/keyboard/common/ext/DiffableListItemType;", "", "comparableContents", "", "itemIdentifier", "desiemoji_debug"})
public abstract interface DiffableListItemType {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Object itemIdentifier();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.Object> comparableContents();
}