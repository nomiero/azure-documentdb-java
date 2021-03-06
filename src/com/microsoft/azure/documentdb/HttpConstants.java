/* 
 * Copyright (c) Microsoft Corporation.  All rights reserved.
 */

package com.microsoft.azure.documentdb;

/**
 * HTTP constants.
 */
class HttpConstants {
    public static class HttpMethods {
        public static final String GET = "GET";
        public static final String POST = "POST";
        public static final String PUT = "PUT";
        public static final String DELETE = "DELETE";
        public static final String HEAD = "HEAD";
        public static final String OPTIONS = "OPTIONS";
        public static final String PATCH = "PATCH";
    }

    public static class HttpHeaders {
        public static final String AUTHORIZATION = "authorization";
        public static final String E_TAG = "etag";
        public static final String METHOD_OVERRIDE = "X-HTTP-Method";
        public static final String SLUG = "Slug";
        public static final String CONTENT_TYPE = "Content-Type";
        public static final String LAST_MODIFIED = "Last-Modified";
        public static final String CONTENT_ENCODING = "Content-Encoding";
        public static final String CHARACTER_SET = "CharacterSet";
        public static final String USER_AGENT = "User-Agent";
        public static final String IF_MODIFIED_SINCE = "If-Modified-Since";
        public static final String IF_MATCH = "If-Match";
        public static final String IF_NONE_MATCH = "If-None-Match";
        public static final String CONTENT_LENGTH = "Content-Length";
        public static final String ACCEPT_ENCODING = "Accept-Encoding";
        public static final String KEEP_ALIVE = "Keep-Alive";
        public static final String CACHE_CONTROL = "Cache-Control";
        public static final String TRANSFER_ENCODING = "Transfer-Encoding";
        public static final String CONTENT_LANGUAGE = "Content-Language";
        public static final String CONTENT_LOCATION = "Content-Location";
        public static final String CONTENT_MD5 = "Content-Md5";
        public static final String CONTENT_RANGE = "Content-Range";
        public static final String ACCEPT = "Accept";
        public static final String ACCEPT_CHARSET = "Accept-Charset";
        public static final String ACCEPT_LANGUAGE = "Accept-Language";
        public static final String IF_RANGE = "If-Range";
        public static final String IF_UNMODIFIED_SINCE = "If-Unmodified-Since";
        public static final String MAX_FORWARDS = "Max-Forwards";
        public static final String PROXY_AUTHORIZATION = "Proxy-Authorization";
        public static final String ACCEPT_RANGES = "Accept-Ranges";
        public static final String PROXY_AUTHENTICATE = "Proxy-Authenticate";
        public static final String RETRY_AFTER = "Retry-After";
        public static final String SET_COOKIE = "Set-Cookie";
        public static final String WWW_AUTHENTICATE = "Www-Authenticate";
        public static final String ORIGIN = "Origin";
        public static final String HOST = "Host";
        public static final String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
        public static final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
        public static final String KEY_VALUE_ENCODING_FORMAT = "application/x-www-form-urlencoded";
        public static final String WRAP_ASSERTION_FORMAT = "wrap_assertion_format";
        public static final String WRAP_ASSERTION = "wrap_assertion";
        public static final String WRAP_SCOPE = "wrap_scope";
        public static final String SIMPLE_TOKEN = "SWT";
        public static final String HTTP_DATE = "date";
        public static final String PREFER = "Prefer";
        public static final String LOCATION = "Location";
        public static final String REFERER = "referer";

        // Query
        public static final String QUERY = "x-ms-documentdb-query";
        public static final String IS_QUERY = "x-ms-documentdb-isquery";

        // Our custom DocDB headers
        public static final String CONTINUATION = "x-ms-continuation";
        public static final String PAGE_SIZE = "x-ms-max-item-count";

        // Request sender generated. Simply echoed by backend.
        public static final String ACTIVITY_ID = "x-ms-activity-id";
        public static final String PRE_TRIGGER_INCLUDE = "x-ms-documentdb-pre-trigger-include";
        public static final String PRE_TRIGGER_EXCLUDE = "x-ms-documentdb-pre-trigger-exclude";
        public static final String POST_TRIGGER_INCLUDE = "x-ms-documentdb-post-trigger-include";
        public static final String POST_TRIGGER_EXCLUDE = "x-ms-documentdb-post-trigger-exclude";
        public static final String INDEXING_DIRECTIVE = "x-ms-indexing-directive";
        public static final String SESSION_TOKEN = "x-ms-session-token";
        public static final String CONSISTENCY_LEVEL = "x-ms-consistency-level";
        public static final String X_DATE = "x-ms-date";
        public static final String COLLECTION_PARTITION_INFO = "x-ms-collection-partition-info";
        public static final String COLLECTION_SERVICE_INFO = "x-ms-collection-service-info";
        public static final String RETRY_AFTER_IN_MILLISECONDS = "x-ms-retry-after-ms";
        public static final String IS_FEED_UNFILTERED = "x-ms-is-feed-unfiltered";
        public static final String RESOURCE_TOKEN_EXPIRY = "x-ms-documentdb-expiry-seconds";
        public static final String ENABLE_SCAN_IN_QUERY = "x-ms-documentdb-query-enable-scan";
        public static final String EMIT_VERBOSE_TRACES_IN_QUERY = "x-ms-documentdb-query-emit-traces";

        // Quota Info

        public static final String MAX_RESOURCE_QUOTA = "x-ms-resource-quota";
        public static final String CURRENT_RESOURCE_QUOTA_USAGE = "x-ms-resource-usage";
        public static final String MAX_MEDIA_STORAGE_USAGE_IN_MB = "x-ms-max-media-storage-usage-mb";

        // Usage Info
        public static final String REQUEST_CHARGE = "x-ms-request-charge";
        public static final String CURRENT_MEDIA_STORAGE_USAGE_IN_MB = "x-ms-media-storage-usage-mb";
        public static final String DATABASE_ACCOUNT_CAPACITY_UNITS_CONSUMED = "x-ms-database-capacity-units-consumed";
        public static final String DATABASE_ACCOUNT_CAPACITY_UNITS_PROVISIONED = "x-ms-database-capacity-units-provisioned";
        public static final String DATABASE_ACCOUNT_CONSUMED_DOCUMENT_STORAGE_IN_MB = "x-ms-databaseaccount-consumed-mb";
        public static final String DATABASE_ACCOUNT_RESERVED_DOCUMENT_STORAGE_IN_MB = "x-ms-databaseaccount-reserved-mb";
        public static final String DATABASE_ACCOUNT_PROVISIONED_DOCUMENT_STORAGE_IN_MB = "x-ms-databaseaccount-provisioned-mb";

        // Address related headers.
        public static final String FORCE_REFRESH = "x-ms-force-refresh";
        public static final String ITEM_COUNT = "x-ms-item-count";
        public static final String NEW_RESOURCE_ID = "x-ms-new-resource-id";
        public static final String USE_MASTER_COLLECTION_RESOLVER = "x-ms-use-master-collection-resolver";
        // Admin Headers
        public static final String FULL_UPGRADE = "x-ms-force-full-upgrade";
        public static final String ONLY_UPGRADE_SYSTEM_APPLICATIONS = "x-ms-only-upgrade-system-applications";
        public static final String ONLY_UPGRADE_NON_SYSTEM_APPLICATIONS = "x-ms-only-upgrade-non-system-applications";
        public static final String UPGRADE_FABRIC_RING_CODE_AND_CONFIG = "x-ms-upgrade-fabric-code-config";
        public static final String IGNORE_IN_PROGRESS_UPGRADE = "x-ms-ignore-inprogress-upgrade";
        public static final String UPGRADE_VERIFICATION_KIND = "x-ms-upgrade-verification-kind";
        public static final String IS_CANARY = "x-ms-iscanary";
        public static final String FORCE_DELETE = "x-ms-force-delete";

        // Version headers and values
        public static final String VERSION = "x-ms-version";
        public static final String SCHEMA_VERSION = "x-ms-schemaversion";
        public static final String SERVER_VERSION = "x-ms-serviceversion";
        public static final String GATEWAY_VERSION = "x-ms-gatewayversion";

        // RDFE Resource Provider headers
        public static final String OCP_RESOURCE_PROVIDER_REGISTERED_URI = "ocp-resourceprovider-registered-uri";

        // For Document service management operations only. This is in
        // essence a 'handle' to (long running) operations.
        public static final String REQUEST_ID = "x-ms-request-id";

        // Object returning this determines what constitutes state and what
        // last state change means. For replica, it is the last role change.
        public static final String LAST_STATE_CHANGE_UTC = "x-ms-last-state-change-utc";

        // CSM specific headers
        // Client-request-id: Optional caller-specified request ID, in the form
        // of a GUID
        public static final String CLIENT_REQUEST_ID = "x-ms-client-request-id";
    }

    public static class Versions {
        // For DocumentServiceProperties and MediaIdFormatChange, Gateway will
        // work for the version later than this version.
        public static String DOCUMENT_SERVICE_PROPERTIES_VERSION_20131105 = "2013-11-05";
        public static String MEDIA_ID_FORMAT_CHANGE_VERSION_20140418 = "2014-02-25";

        public static String CURRENT_VERSION = "2014-08-21";

        public static String USER_AGENT = "documentdb-java-sdk-0.9.5";
    }
    
    public static class StatusCodes {
        public static int MINIMUM_STATUSCODE_AS_ERROR_GATEWAY = 400; 
    }
}
