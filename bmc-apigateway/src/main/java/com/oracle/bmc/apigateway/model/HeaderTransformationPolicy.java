/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * A set of transformations to apply to HTTP headers that pass through the gateway. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HeaderTransformationPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HeaderTransformationPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"setHeaders", "renameHeaders", "filterHeaders"})
    public HeaderTransformationPolicy(
            SetHeaderPolicy setHeaders,
            RenameHeaderPolicy renameHeaders,
            FilterHeaderPolicy filterHeaders) {
        super();
        this.setHeaders = setHeaders;
        this.renameHeaders = renameHeaders;
        this.filterHeaders = filterHeaders;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("setHeaders")
        private SetHeaderPolicy setHeaders;

        public Builder setHeaders(SetHeaderPolicy setHeaders) {
            this.setHeaders = setHeaders;
            this.__explicitlySet__.add("setHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("renameHeaders")
        private RenameHeaderPolicy renameHeaders;

        public Builder renameHeaders(RenameHeaderPolicy renameHeaders) {
            this.renameHeaders = renameHeaders;
            this.__explicitlySet__.add("renameHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filterHeaders")
        private FilterHeaderPolicy filterHeaders;

        public Builder filterHeaders(FilterHeaderPolicy filterHeaders) {
            this.filterHeaders = filterHeaders;
            this.__explicitlySet__.add("filterHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HeaderTransformationPolicy build() {
            HeaderTransformationPolicy model =
                    new HeaderTransformationPolicy(
                            this.setHeaders, this.renameHeaders, this.filterHeaders);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HeaderTransformationPolicy model) {
            if (model.wasPropertyExplicitlySet("setHeaders")) {
                this.setHeaders(model.getSetHeaders());
            }
            if (model.wasPropertyExplicitlySet("renameHeaders")) {
                this.renameHeaders(model.getRenameHeaders());
            }
            if (model.wasPropertyExplicitlySet("filterHeaders")) {
                this.filterHeaders(model.getFilterHeaders());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("setHeaders")
    private final SetHeaderPolicy setHeaders;

    public SetHeaderPolicy getSetHeaders() {
        return setHeaders;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("renameHeaders")
    private final RenameHeaderPolicy renameHeaders;

    public RenameHeaderPolicy getRenameHeaders() {
        return renameHeaders;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("filterHeaders")
    private final FilterHeaderPolicy filterHeaders;

    public FilterHeaderPolicy getFilterHeaders() {
        return filterHeaders;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HeaderTransformationPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("setHeaders=").append(String.valueOf(this.setHeaders));
        sb.append(", renameHeaders=").append(String.valueOf(this.renameHeaders));
        sb.append(", filterHeaders=").append(String.valueOf(this.filterHeaders));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HeaderTransformationPolicy)) {
            return false;
        }

        HeaderTransformationPolicy other = (HeaderTransformationPolicy) o;
        return java.util.Objects.equals(this.setHeaders, other.setHeaders)
                && java.util.Objects.equals(this.renameHeaders, other.renameHeaders)
                && java.util.Objects.equals(this.filterHeaders, other.filterHeaders)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.setHeaders == null ? 43 : this.setHeaders.hashCode());
        result =
                (result * PRIME)
                        + (this.renameHeaders == null ? 43 : this.renameHeaders.hashCode());
        result =
                (result * PRIME)
                        + (this.filterHeaders == null ? 43 : this.filterHeaders.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
