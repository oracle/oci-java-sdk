/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;

/**
 * Base class for models implementing the explicitly set behavior.
 * Subclasses should be annotated with
 * {@code com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)}.
 *
 * All the properties that were explicitly set by user will be serialized, even if set to {@code null}.
 */
@JsonFilter(ExplicitlySetFilter.NAME)
public abstract class ExplicitlySetBmcModel {
    /**
     * A hash set that stores the names of the properties that were
     * explicitly set by user. These properties will be included in the
     * json request even if they were set to {@code null}.
     */
    @JsonIgnore private final Set<String> __explicitlySet__ = new HashSet<>();

    /**
     * Specify that a model property was explicitly set by user.
     * The method should be used inside property setters.
     *
     * @param propertyName the name of the model property to mark as
     *                     set by user. Should match the property name
     *                     exactly.
     */
    protected void markPropertyAsExplicitlySet(String propertyName) {
        __explicitlySet__.add(propertyName);
    }

    /**
     * Get whether a property was explicitly specified by user.
     * It is highly unlikely that this is the method you want to use as a user.
     *
     * @param propertyName the name of the property.
     * @return whether the property was explicitly specified by user.
     */
    protected boolean wasPropertyExplicitlySet(String propertyName) {
        return this.__explicitlySet__.contains(propertyName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExplicitlySetBmcModel)) {
            return false;
        }

        return java.util.Objects.equals(
                this.__explicitlySet__, ((ExplicitlySetBmcModel) o).__explicitlySet__);
    }

    @Override
    public int hashCode() {
        return this.__explicitlySet__.hashCode();
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("BmcModel(__explicitlySet__=")
                .append(this.__explicitlySet__)
                .append(")")
                .toString();
    }
}
