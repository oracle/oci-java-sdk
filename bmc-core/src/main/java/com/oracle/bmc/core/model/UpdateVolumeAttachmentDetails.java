/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * details for updating a volume attachment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateVolumeAttachmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateVolumeAttachmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"iscsiLoginState"})
    public UpdateVolumeAttachmentDetails(IscsiLoginState iscsiLoginState) {
        super();
        this.iscsiLoginState = iscsiLoginState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The iscsi login state of the volume attachment. For a multipath volume attachment, all
         * iscsi sessions need to be all logged-in or logged-out to be in logged-in or logged-out
         * state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("iscsiLoginState")
        private IscsiLoginState iscsiLoginState;

        /**
         * The iscsi login state of the volume attachment. For a multipath volume attachment, all
         * iscsi sessions need to be all logged-in or logged-out to be in logged-in or logged-out
         * state.
         *
         * @param iscsiLoginState the value to set
         * @return this builder
         */
        public Builder iscsiLoginState(IscsiLoginState iscsiLoginState) {
            this.iscsiLoginState = iscsiLoginState;
            this.__explicitlySet__.add("iscsiLoginState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVolumeAttachmentDetails build() {
            UpdateVolumeAttachmentDetails model =
                    new UpdateVolumeAttachmentDetails(this.iscsiLoginState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVolumeAttachmentDetails model) {
            if (model.wasPropertyExplicitlySet("iscsiLoginState")) {
                this.iscsiLoginState(model.getIscsiLoginState());
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

    /**
     * The iscsi login state of the volume attachment. For a multipath volume attachment, all iscsi
     * sessions need to be all logged-in or logged-out to be in logged-in or logged-out state.
     */
    public enum IscsiLoginState implements com.oracle.bmc.http.internal.BmcEnum {
        Unknown("UNKNOWN"),
        LoggingIn("LOGGING_IN"),
        LoginSucceeded("LOGIN_SUCCEEDED"),
        LoginFailed("LOGIN_FAILED"),
        LoggingOut("LOGGING_OUT"),
        LogoutSucceeded("LOGOUT_SUCCEEDED"),
        LogoutFailed("LOGOUT_FAILED"),
        ;

        private final String value;
        private static java.util.Map<String, IscsiLoginState> map;

        static {
            map = new java.util.HashMap<>();
            for (IscsiLoginState v : IscsiLoginState.values()) {
                map.put(v.getValue(), v);
            }
        }

        IscsiLoginState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IscsiLoginState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IscsiLoginState: " + key);
        }
    };
    /**
     * The iscsi login state of the volume attachment. For a multipath volume attachment, all iscsi
     * sessions need to be all logged-in or logged-out to be in logged-in or logged-out state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("iscsiLoginState")
    private final IscsiLoginState iscsiLoginState;

    /**
     * The iscsi login state of the volume attachment. For a multipath volume attachment, all iscsi
     * sessions need to be all logged-in or logged-out to be in logged-in or logged-out state.
     *
     * @return the value
     */
    public IscsiLoginState getIscsiLoginState() {
        return iscsiLoginState;
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
        sb.append("UpdateVolumeAttachmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("iscsiLoginState=").append(String.valueOf(this.iscsiLoginState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVolumeAttachmentDetails)) {
            return false;
        }

        UpdateVolumeAttachmentDetails other = (UpdateVolumeAttachmentDetails) o;
        return java.util.Objects.equals(this.iscsiLoginState, other.iscsiLoginState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.iscsiLoginState == null ? 43 : this.iscsiLoginState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
