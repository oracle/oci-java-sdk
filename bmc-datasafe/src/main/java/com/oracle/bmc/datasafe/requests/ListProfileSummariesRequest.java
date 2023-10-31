/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListProfileSummariesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListProfileSummariesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListProfileSummariesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the user assessment. */
    private String userAssessmentId;

    /** The OCID of the user assessment. */
    public String getUserAssessmentId() {
        return userAssessmentId;
    }
    /** A filter to return only resources that match the specified compartment OCID. */
    private String compartmentId;

    /** A filter to return only resources that match the specified compartment OCID. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel'
     * setting.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel'
     * setting.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE
     * returns only those compartments for which the user has INSPECT permissions directly or
     * indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED
     * permissions are checked and no partial results are displayed.
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE
     * returns only those compartments for which the user has INSPECT permissions directly or
     * indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED
     * permissions are checked and no partial results are displayed.
     */
    public enum AccessLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Restricted("RESTRICTED"),
        Accessible("ACCESSIBLE"),
        ;

        private final String value;
        private static java.util.Map<String, AccessLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessLevel v : AccessLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        AccessLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AccessLevel: " + key);
        }
    };

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE
     * returns only those compartments for which the user has INSPECT permissions directly or
     * indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED
     * permissions are checked and no partial results are displayed.
     */
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    /** A filter to return only items related to a specific target OCID. */
    private String targetId;

    /** A filter to return only items related to a specific target OCID. */
    public String getTargetId() {
        return targetId;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** A filter to return only items that match the specified profile name. */
    private String profileName;

    /** A filter to return only items that match the specified profile name. */
    public String getProfileName() {
        return profileName;
    }
    /** An optional filter to return the user created profiles. */
    private Boolean isUserCreated;

    /** An optional filter to return the user created profiles. */
    public Boolean getIsUserCreated() {
        return isUserCreated;
    }
    /** An optional filter to filter the profiles based on password verification function. */
    private String passwordVerificationFunction;

    /** An optional filter to filter the profiles based on password verification function. */
    public String getPasswordVerificationFunction() {
        return passwordVerificationFunction;
    }
    /**
     * An optional filter to return the profiles having user count greater than or equal to the
     * provided value.
     */
    private String userCountGreaterThanOrEqual;

    /**
     * An optional filter to return the profiles having user count greater than or equal to the
     * provided value.
     */
    public String getUserCountGreaterThanOrEqual() {
        return userCountGreaterThanOrEqual;
    }
    /** An optional filter to return the profiles having user count less than the provided value. */
    private String userCountLessThan;

    /** An optional filter to return the profiles having user count less than the provided value. */
    public String getUserCountLessThan() {
        return userCountLessThan;
    }
    /**
     * An optional filter to return the profiles having allow failed login attempts number greater
     * than or equal to the provided value. String value is used for accommodating the "UNLIMITED"
     * and "DEFAULT" values.
     */
    private String failedLoginAttemptsGreaterThanOrEqual;

    /**
     * An optional filter to return the profiles having allow failed login attempts number greater
     * than or equal to the provided value. String value is used for accommodating the "UNLIMITED"
     * and "DEFAULT" values.
     */
    public String getFailedLoginAttemptsGreaterThanOrEqual() {
        return failedLoginAttemptsGreaterThanOrEqual;
    }
    /**
     * An optional filter to return the profiles having failed login attempts number less than the
     * provided value. String value is used for accommodating the "UNLIMITED" and "DEFAULT" values.
     */
    private String failedLoginAttemptsLessThan;

    /**
     * An optional filter to return the profiles having failed login attempts number less than the
     * provided value. String value is used for accommodating the "UNLIMITED" and "DEFAULT" values.
     */
    public String getFailedLoginAttemptsLessThan() {
        return failedLoginAttemptsLessThan;
    }
    /**
     * An optional filter to return the profiles permitting the user to spawn multiple sessions
     * having count. greater than or equal to the provided value. String value is used for
     * accommodating the "UNLIMITED" and "DEFAULT" values.
     */
    private String sessionsPerUserGreaterThanOrEqual;

    /**
     * An optional filter to return the profiles permitting the user to spawn multiple sessions
     * having count. greater than or equal to the provided value. String value is used for
     * accommodating the "UNLIMITED" and "DEFAULT" values.
     */
    public String getSessionsPerUserGreaterThanOrEqual() {
        return sessionsPerUserGreaterThanOrEqual;
    }
    /**
     * An optional filter to return the profiles permitting the user to spawn multiple sessions
     * having count less than the provided value. String value is used for accommodating the
     * "UNLIMITED" and "DEFAULT" values.
     */
    private String sessionsPerUserLessThan;

    /**
     * An optional filter to return the profiles permitting the user to spawn multiple sessions
     * having count less than the provided value. String value is used for accommodating the
     * "UNLIMITED" and "DEFAULT" values.
     */
    public String getSessionsPerUserLessThan() {
        return sessionsPerUserLessThan;
    }
    /**
     * An optional filter to return the profiles allowing inactive account time in days greater than
     * or equal to the provided value. String value is used for accommodating the "UNLIMITED" and
     * "DEFAULT" values.
     */
    private String inactiveAccountTimeGreaterThanOrEqual;

    /**
     * An optional filter to return the profiles allowing inactive account time in days greater than
     * or equal to the provided value. String value is used for accommodating the "UNLIMITED" and
     * "DEFAULT" values.
     */
    public String getInactiveAccountTimeGreaterThanOrEqual() {
        return inactiveAccountTimeGreaterThanOrEqual;
    }
    /**
     * An optional filter to return the profiles allowing inactive account time in days less than
     * the provided value. String value is used for accommodating the "UNLIMITED" and "DEFAULT"
     * values.
     */
    private String inactiveAccountTimeLessThan;

    /**
     * An optional filter to return the profiles allowing inactive account time in days less than
     * the provided value. String value is used for accommodating the "UNLIMITED" and "DEFAULT"
     * values.
     */
    public String getInactiveAccountTimeLessThan() {
        return inactiveAccountTimeLessThan;
    }
    /**
     * An optional filter to return the profiles having password lock number greater than or equal
     * to the provided value. String value is used for accommodating the "UNLIMITED" and "DEFAULT"
     * values.
     */
    private String passwordLockTimeGreaterThanOrEqual;

    /**
     * An optional filter to return the profiles having password lock number greater than or equal
     * to the provided value. String value is used for accommodating the "UNLIMITED" and "DEFAULT"
     * values.
     */
    public String getPasswordLockTimeGreaterThanOrEqual() {
        return passwordLockTimeGreaterThanOrEqual;
    }
    /**
     * An optional filter to return the profiles having password lock number less than the provided
     * value. String value is used for accommodating the "UNLIMITED" and "DEFAULT" values.
     */
    private String passwordLockTimeLessThan;

    /**
     * An optional filter to return the profiles having password lock number less than the provided
     * value. String value is used for accommodating the "UNLIMITED" and "DEFAULT" values.
     */
    public String getPasswordLockTimeLessThan() {
        return passwordLockTimeLessThan;
    }
    /**
     * The field to sort by. You can specify only one sort order (sortOrder). The default order is
     * targetId ASC.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order (sortOrder). The default order is
     * targetId ASC.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        ProfileName("profileName"),
        TargetId("targetId"),
        IsUserCreated("isUserCreated"),
        PasswordVerificationFunction("passwordVerificationFunction"),
        UserCount("userCount"),
        SessionsPerUser("sessionsPerUser"),
        InactiveAccountTime("inactiveAccountTime"),
        PasswordLockTime("passwordLockTime"),
        FailedLoginAttempts("failedLoginAttempts"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The field to sort by. You can specify only one sort order (sortOrder). The default order is
     * targetId ASC.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListProfileSummariesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the user assessment. */
        private String userAssessmentId = null;

        /**
         * The OCID of the user assessment.
         *
         * @param userAssessmentId the value to set
         * @return this builder instance
         */
        public Builder userAssessmentId(String userAssessmentId) {
            this.userAssessmentId = userAssessmentId;
            return this;
        }

        /** A filter to return only resources that match the specified compartment OCID. */
        private String compartmentId = null;

        /**
         * A filter to return only resources that match the specified compartment OCID.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned. Depends on the
         * 'accessLevel' setting.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned. Depends on the
         * 'accessLevel' setting.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to
         * ACCESSIBLE returns only those compartments for which the user has INSPECT permissions
         * directly or indirectly (permissions can be on a resource in a subcompartment). When set
         * to RESTRICTED permissions are checked and no partial results are displayed.
         */
        private AccessLevel accessLevel = null;

        /**
         * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to
         * ACCESSIBLE returns only those compartments for which the user has INSPECT permissions
         * directly or indirectly (permissions can be on a resource in a subcompartment). When set
         * to RESTRICTED permissions are checked and no partial results are displayed.
         *
         * @param accessLevel the value to set
         * @return this builder instance
         */
        public Builder accessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        /** A filter to return only items related to a specific target OCID. */
        private String targetId = null;

        /**
         * A filter to return only items related to a specific target OCID.
         *
         * @param targetId the value to set
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** A filter to return only items that match the specified profile name. */
        private String profileName = null;

        /**
         * A filter to return only items that match the specified profile name.
         *
         * @param profileName the value to set
         * @return this builder instance
         */
        public Builder profileName(String profileName) {
            this.profileName = profileName;
            return this;
        }

        /** An optional filter to return the user created profiles. */
        private Boolean isUserCreated = null;

        /**
         * An optional filter to return the user created profiles.
         *
         * @param isUserCreated the value to set
         * @return this builder instance
         */
        public Builder isUserCreated(Boolean isUserCreated) {
            this.isUserCreated = isUserCreated;
            return this;
        }

        /** An optional filter to filter the profiles based on password verification function. */
        private String passwordVerificationFunction = null;

        /**
         * An optional filter to filter the profiles based on password verification function.
         *
         * @param passwordVerificationFunction the value to set
         * @return this builder instance
         */
        public Builder passwordVerificationFunction(String passwordVerificationFunction) {
            this.passwordVerificationFunction = passwordVerificationFunction;
            return this;
        }

        /**
         * An optional filter to return the profiles having user count greater than or equal to the
         * provided value.
         */
        private String userCountGreaterThanOrEqual = null;

        /**
         * An optional filter to return the profiles having user count greater than or equal to the
         * provided value.
         *
         * @param userCountGreaterThanOrEqual the value to set
         * @return this builder instance
         */
        public Builder userCountGreaterThanOrEqual(String userCountGreaterThanOrEqual) {
            this.userCountGreaterThanOrEqual = userCountGreaterThanOrEqual;
            return this;
        }

        /**
         * An optional filter to return the profiles having user count less than the provided value.
         */
        private String userCountLessThan = null;

        /**
         * An optional filter to return the profiles having user count less than the provided value.
         *
         * @param userCountLessThan the value to set
         * @return this builder instance
         */
        public Builder userCountLessThan(String userCountLessThan) {
            this.userCountLessThan = userCountLessThan;
            return this;
        }

        /**
         * An optional filter to return the profiles having allow failed login attempts number
         * greater than or equal to the provided value. String value is used for accommodating the
         * "UNLIMITED" and "DEFAULT" values.
         */
        private String failedLoginAttemptsGreaterThanOrEqual = null;

        /**
         * An optional filter to return the profiles having allow failed login attempts number
         * greater than or equal to the provided value. String value is used for accommodating the
         * "UNLIMITED" and "DEFAULT" values.
         *
         * @param failedLoginAttemptsGreaterThanOrEqual the value to set
         * @return this builder instance
         */
        public Builder failedLoginAttemptsGreaterThanOrEqual(
                String failedLoginAttemptsGreaterThanOrEqual) {
            this.failedLoginAttemptsGreaterThanOrEqual = failedLoginAttemptsGreaterThanOrEqual;
            return this;
        }

        /**
         * An optional filter to return the profiles having failed login attempts number less than
         * the provided value. String value is used for accommodating the "UNLIMITED" and "DEFAULT"
         * values.
         */
        private String failedLoginAttemptsLessThan = null;

        /**
         * An optional filter to return the profiles having failed login attempts number less than
         * the provided value. String value is used for accommodating the "UNLIMITED" and "DEFAULT"
         * values.
         *
         * @param failedLoginAttemptsLessThan the value to set
         * @return this builder instance
         */
        public Builder failedLoginAttemptsLessThan(String failedLoginAttemptsLessThan) {
            this.failedLoginAttemptsLessThan = failedLoginAttemptsLessThan;
            return this;
        }

        /**
         * An optional filter to return the profiles permitting the user to spawn multiple sessions
         * having count. greater than or equal to the provided value. String value is used for
         * accommodating the "UNLIMITED" and "DEFAULT" values.
         */
        private String sessionsPerUserGreaterThanOrEqual = null;

        /**
         * An optional filter to return the profiles permitting the user to spawn multiple sessions
         * having count. greater than or equal to the provided value. String value is used for
         * accommodating the "UNLIMITED" and "DEFAULT" values.
         *
         * @param sessionsPerUserGreaterThanOrEqual the value to set
         * @return this builder instance
         */
        public Builder sessionsPerUserGreaterThanOrEqual(String sessionsPerUserGreaterThanOrEqual) {
            this.sessionsPerUserGreaterThanOrEqual = sessionsPerUserGreaterThanOrEqual;
            return this;
        }

        /**
         * An optional filter to return the profiles permitting the user to spawn multiple sessions
         * having count less than the provided value. String value is used for accommodating the
         * "UNLIMITED" and "DEFAULT" values.
         */
        private String sessionsPerUserLessThan = null;

        /**
         * An optional filter to return the profiles permitting the user to spawn multiple sessions
         * having count less than the provided value. String value is used for accommodating the
         * "UNLIMITED" and "DEFAULT" values.
         *
         * @param sessionsPerUserLessThan the value to set
         * @return this builder instance
         */
        public Builder sessionsPerUserLessThan(String sessionsPerUserLessThan) {
            this.sessionsPerUserLessThan = sessionsPerUserLessThan;
            return this;
        }

        /**
         * An optional filter to return the profiles allowing inactive account time in days greater
         * than or equal to the provided value. String value is used for accommodating the
         * "UNLIMITED" and "DEFAULT" values.
         */
        private String inactiveAccountTimeGreaterThanOrEqual = null;

        /**
         * An optional filter to return the profiles allowing inactive account time in days greater
         * than or equal to the provided value. String value is used for accommodating the
         * "UNLIMITED" and "DEFAULT" values.
         *
         * @param inactiveAccountTimeGreaterThanOrEqual the value to set
         * @return this builder instance
         */
        public Builder inactiveAccountTimeGreaterThanOrEqual(
                String inactiveAccountTimeGreaterThanOrEqual) {
            this.inactiveAccountTimeGreaterThanOrEqual = inactiveAccountTimeGreaterThanOrEqual;
            return this;
        }

        /**
         * An optional filter to return the profiles allowing inactive account time in days less
         * than the provided value. String value is used for accommodating the "UNLIMITED" and
         * "DEFAULT" values.
         */
        private String inactiveAccountTimeLessThan = null;

        /**
         * An optional filter to return the profiles allowing inactive account time in days less
         * than the provided value. String value is used for accommodating the "UNLIMITED" and
         * "DEFAULT" values.
         *
         * @param inactiveAccountTimeLessThan the value to set
         * @return this builder instance
         */
        public Builder inactiveAccountTimeLessThan(String inactiveAccountTimeLessThan) {
            this.inactiveAccountTimeLessThan = inactiveAccountTimeLessThan;
            return this;
        }

        /**
         * An optional filter to return the profiles having password lock number greater than or
         * equal to the provided value. String value is used for accommodating the "UNLIMITED" and
         * "DEFAULT" values.
         */
        private String passwordLockTimeGreaterThanOrEqual = null;

        /**
         * An optional filter to return the profiles having password lock number greater than or
         * equal to the provided value. String value is used for accommodating the "UNLIMITED" and
         * "DEFAULT" values.
         *
         * @param passwordLockTimeGreaterThanOrEqual the value to set
         * @return this builder instance
         */
        public Builder passwordLockTimeGreaterThanOrEqual(
                String passwordLockTimeGreaterThanOrEqual) {
            this.passwordLockTimeGreaterThanOrEqual = passwordLockTimeGreaterThanOrEqual;
            return this;
        }

        /**
         * An optional filter to return the profiles having password lock number less than the
         * provided value. String value is used for accommodating the "UNLIMITED" and "DEFAULT"
         * values.
         */
        private String passwordLockTimeLessThan = null;

        /**
         * An optional filter to return the profiles having password lock number less than the
         * provided value. String value is used for accommodating the "UNLIMITED" and "DEFAULT"
         * values.
         *
         * @param passwordLockTimeLessThan the value to set
         * @return this builder instance
         */
        public Builder passwordLockTimeLessThan(String passwordLockTimeLessThan) {
            this.passwordLockTimeLessThan = passwordLockTimeLessThan;
            return this;
        }

        /**
         * The field to sort by. You can specify only one sort order (sortOrder). The default order
         * is targetId ASC.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sort order (sortOrder). The default order
         * is targetId ASC.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either ascending (ASC) or descending (DESC). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(ListProfileSummariesRequest o) {
            userAssessmentId(o.getUserAssessmentId());
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            targetId(o.getTargetId());
            limit(o.getLimit());
            page(o.getPage());
            profileName(o.getProfileName());
            isUserCreated(o.getIsUserCreated());
            passwordVerificationFunction(o.getPasswordVerificationFunction());
            userCountGreaterThanOrEqual(o.getUserCountGreaterThanOrEqual());
            userCountLessThan(o.getUserCountLessThan());
            failedLoginAttemptsGreaterThanOrEqual(o.getFailedLoginAttemptsGreaterThanOrEqual());
            failedLoginAttemptsLessThan(o.getFailedLoginAttemptsLessThan());
            sessionsPerUserGreaterThanOrEqual(o.getSessionsPerUserGreaterThanOrEqual());
            sessionsPerUserLessThan(o.getSessionsPerUserLessThan());
            inactiveAccountTimeGreaterThanOrEqual(o.getInactiveAccountTimeGreaterThanOrEqual());
            inactiveAccountTimeLessThan(o.getInactiveAccountTimeLessThan());
            passwordLockTimeGreaterThanOrEqual(o.getPasswordLockTimeGreaterThanOrEqual());
            passwordLockTimeLessThan(o.getPasswordLockTimeLessThan());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListProfileSummariesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListProfileSummariesRequest
         */
        public ListProfileSummariesRequest build() {
            ListProfileSummariesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListProfileSummariesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListProfileSummariesRequest
         */
        public ListProfileSummariesRequest buildWithoutInvocationCallback() {
            ListProfileSummariesRequest request = new ListProfileSummariesRequest();
            request.userAssessmentId = userAssessmentId;
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.targetId = targetId;
            request.limit = limit;
            request.page = page;
            request.profileName = profileName;
            request.isUserCreated = isUserCreated;
            request.passwordVerificationFunction = passwordVerificationFunction;
            request.userCountGreaterThanOrEqual = userCountGreaterThanOrEqual;
            request.userCountLessThan = userCountLessThan;
            request.failedLoginAttemptsGreaterThanOrEqual = failedLoginAttemptsGreaterThanOrEqual;
            request.failedLoginAttemptsLessThan = failedLoginAttemptsLessThan;
            request.sessionsPerUserGreaterThanOrEqual = sessionsPerUserGreaterThanOrEqual;
            request.sessionsPerUserLessThan = sessionsPerUserLessThan;
            request.inactiveAccountTimeGreaterThanOrEqual = inactiveAccountTimeGreaterThanOrEqual;
            request.inactiveAccountTimeLessThan = inactiveAccountTimeLessThan;
            request.passwordLockTimeGreaterThanOrEqual = passwordLockTimeGreaterThanOrEqual;
            request.passwordLockTimeLessThan = passwordLockTimeLessThan;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListProfileSummariesRequest(userAssessmentId, compartmentId,
            // compartmentIdInSubtree, accessLevel, targetId, limit, page, profileName,
            // isUserCreated, passwordVerificationFunction, userCountGreaterThanOrEqual,
            // userCountLessThan, failedLoginAttemptsGreaterThanOrEqual,
            // failedLoginAttemptsLessThan, sessionsPerUserGreaterThanOrEqual,
            // sessionsPerUserLessThan, inactiveAccountTimeGreaterThanOrEqual,
            // inactiveAccountTimeLessThan, passwordLockTimeGreaterThanOrEqual,
            // passwordLockTimeLessThan, sortBy, sortOrder, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .userAssessmentId(userAssessmentId)
                .compartmentId(compartmentId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .targetId(targetId)
                .limit(limit)
                .page(page)
                .profileName(profileName)
                .isUserCreated(isUserCreated)
                .passwordVerificationFunction(passwordVerificationFunction)
                .userCountGreaterThanOrEqual(userCountGreaterThanOrEqual)
                .userCountLessThan(userCountLessThan)
                .failedLoginAttemptsGreaterThanOrEqual(failedLoginAttemptsGreaterThanOrEqual)
                .failedLoginAttemptsLessThan(failedLoginAttemptsLessThan)
                .sessionsPerUserGreaterThanOrEqual(sessionsPerUserGreaterThanOrEqual)
                .sessionsPerUserLessThan(sessionsPerUserLessThan)
                .inactiveAccountTimeGreaterThanOrEqual(inactiveAccountTimeGreaterThanOrEqual)
                .inactiveAccountTimeLessThan(inactiveAccountTimeLessThan)
                .passwordLockTimeGreaterThanOrEqual(passwordLockTimeGreaterThanOrEqual)
                .passwordLockTimeLessThan(passwordLockTimeLessThan)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",userAssessmentId=").append(String.valueOf(this.userAssessmentId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",profileName=").append(String.valueOf(this.profileName));
        sb.append(",isUserCreated=").append(String.valueOf(this.isUserCreated));
        sb.append(",passwordVerificationFunction=")
                .append(String.valueOf(this.passwordVerificationFunction));
        sb.append(",userCountGreaterThanOrEqual=")
                .append(String.valueOf(this.userCountGreaterThanOrEqual));
        sb.append(",userCountLessThan=").append(String.valueOf(this.userCountLessThan));
        sb.append(",failedLoginAttemptsGreaterThanOrEqual=")
                .append(String.valueOf(this.failedLoginAttemptsGreaterThanOrEqual));
        sb.append(",failedLoginAttemptsLessThan=")
                .append(String.valueOf(this.failedLoginAttemptsLessThan));
        sb.append(",sessionsPerUserGreaterThanOrEqual=")
                .append(String.valueOf(this.sessionsPerUserGreaterThanOrEqual));
        sb.append(",sessionsPerUserLessThan=").append(String.valueOf(this.sessionsPerUserLessThan));
        sb.append(",inactiveAccountTimeGreaterThanOrEqual=")
                .append(String.valueOf(this.inactiveAccountTimeGreaterThanOrEqual));
        sb.append(",inactiveAccountTimeLessThan=")
                .append(String.valueOf(this.inactiveAccountTimeLessThan));
        sb.append(",passwordLockTimeGreaterThanOrEqual=")
                .append(String.valueOf(this.passwordLockTimeGreaterThanOrEqual));
        sb.append(",passwordLockTimeLessThan=")
                .append(String.valueOf(this.passwordLockTimeLessThan));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListProfileSummariesRequest)) {
            return false;
        }

        ListProfileSummariesRequest other = (ListProfileSummariesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.userAssessmentId, other.userAssessmentId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.profileName, other.profileName)
                && java.util.Objects.equals(this.isUserCreated, other.isUserCreated)
                && java.util.Objects.equals(
                        this.passwordVerificationFunction, other.passwordVerificationFunction)
                && java.util.Objects.equals(
                        this.userCountGreaterThanOrEqual, other.userCountGreaterThanOrEqual)
                && java.util.Objects.equals(this.userCountLessThan, other.userCountLessThan)
                && java.util.Objects.equals(
                        this.failedLoginAttemptsGreaterThanOrEqual,
                        other.failedLoginAttemptsGreaterThanOrEqual)
                && java.util.Objects.equals(
                        this.failedLoginAttemptsLessThan, other.failedLoginAttemptsLessThan)
                && java.util.Objects.equals(
                        this.sessionsPerUserGreaterThanOrEqual,
                        other.sessionsPerUserGreaterThanOrEqual)
                && java.util.Objects.equals(
                        this.sessionsPerUserLessThan, other.sessionsPerUserLessThan)
                && java.util.Objects.equals(
                        this.inactiveAccountTimeGreaterThanOrEqual,
                        other.inactiveAccountTimeGreaterThanOrEqual)
                && java.util.Objects.equals(
                        this.inactiveAccountTimeLessThan, other.inactiveAccountTimeLessThan)
                && java.util.Objects.equals(
                        this.passwordLockTimeGreaterThanOrEqual,
                        other.passwordLockTimeGreaterThanOrEqual)
                && java.util.Objects.equals(
                        this.passwordLockTimeLessThan, other.passwordLockTimeLessThan)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.userAssessmentId == null ? 43 : this.userAssessmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.profileName == null ? 43 : this.profileName.hashCode());
        result =
                (result * PRIME)
                        + (this.isUserCreated == null ? 43 : this.isUserCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordVerificationFunction == null
                                ? 43
                                : this.passwordVerificationFunction.hashCode());
        result =
                (result * PRIME)
                        + (this.userCountGreaterThanOrEqual == null
                                ? 43
                                : this.userCountGreaterThanOrEqual.hashCode());
        result =
                (result * PRIME)
                        + (this.userCountLessThan == null ? 43 : this.userCountLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.failedLoginAttemptsGreaterThanOrEqual == null
                                ? 43
                                : this.failedLoginAttemptsGreaterThanOrEqual.hashCode());
        result =
                (result * PRIME)
                        + (this.failedLoginAttemptsLessThan == null
                                ? 43
                                : this.failedLoginAttemptsLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionsPerUserGreaterThanOrEqual == null
                                ? 43
                                : this.sessionsPerUserGreaterThanOrEqual.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionsPerUserLessThan == null
                                ? 43
                                : this.sessionsPerUserLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.inactiveAccountTimeGreaterThanOrEqual == null
                                ? 43
                                : this.inactiveAccountTimeGreaterThanOrEqual.hashCode());
        result =
                (result * PRIME)
                        + (this.inactiveAccountTimeLessThan == null
                                ? 43
                                : this.inactiveAccountTimeLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordLockTimeGreaterThanOrEqual == null
                                ? 43
                                : this.passwordLockTimeGreaterThanOrEqual.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordLockTimeLessThan == null
                                ? 43
                                : this.passwordLockTimeLessThan.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
