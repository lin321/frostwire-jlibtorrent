package com.frostwire.jlibtorrent;

import com.frostwire.jlibtorrent.swig.torrent_status;

public final class TorrentStatus {

    TorrentStatus(torrent_status status) {
//    torrent_handle handle;
//    std::string error;
//    std::string save_path;
//    std::string name;
//    boost::intrusive_ptr<const torrent_info> torrent_file;
//    boost::posix_time::time_duration next_announce;
//    boost::posix_time::time_duration announce_interval;
//    std::string current_tracker;
        this.totalDownload = status.getTotal_download();
        this.totalUpload = status.getTotal_upload();
        this.totalPayloadDownload = status.getTotal_payload_download();
        this.totalPayloadUpload = status.getTotal_payload_upload();
        this.totalFailedBytes = status.getTotal_failed_bytes();
        this.totalRedundantBytes = status.getTotal_redundant_bytes();
//    bitfield pieces;
//    bitfield verified_pieces;
        this.totalDone = status.getTotal_done();
        this.totalWantedDone = status.getTotal_wanted_done();
        this.totalWanted = status.getTotal_wanted();
        this.allTimeUpload = status.getAll_time_upload();
        this.allTimeDownload = status.getAll_time_download();
        this.addedTime = status.getAdded_time();
        this.completedTime = status.getCompleted_time();
        this.lastSeenComplete = status.getLast_seen_complete();
//    storage_mode_t storage_mode;
        this.progress = status.getProgress();
        this.progressPpm = status.getProgress_ppm();
        this.queuePosition = status.getQueue_position();
        this.downloadRate = status.getDownload_rate();
        this.uploadRate = status.getUpload_rate();
        this.downloadPayloadRate = status.getDownload_payload_rate();
        this.uploadPayloadRate = status.getUpload_payload_rate();
        this.numSeeds = status.getNum_seeds();
        this.numPeers = status.getNum_peers();
        this.numComplete = status.getNum_complete();
        this.numIncomplete = status.getNum_incomplete();
        this.listSeeds = status.getList_seeds();
        this.listPeers = status.getList_peers();
        this.connectCandidates = status.getConnect_candidates();
        this.numPieces = status.getNum_pieces();
        this.distributedFullCopies = status.getDistributed_full_copies();
        this.distributedFraction = status.getDistributed_fraction();
        this.distributedCopies = status.getDistributed_copies();
        this.blockSize = status.getBlock_size();
        this.numUploads = status.getNum_uploads();
        this.numConnections = status.getNum_connections();
        this.uploadsLimit = status.getUploads_limit();
        this.connectionsLimit = status.getConnections_limit();
        this.upBandwidthQueue = status.getUp_bandwidth_queue();
        this.downBandwidthQueue = status.getDown_bandwidth_queue();
        this.timeSinceUpload = status.getTime_since_upload();
        this.timeSinceDownload = status.getTime_since_download();
        this.activeTime = status.getActive_time();
        this.finishedTime = status.getFinished_time();
        this.seedingTime = status.getSeeding_time();
        this.seedRank = status.getSeed_rank();
        this.lastScrape = status.getLast_scrape();
        this.sparseRegions = status.getSparse_regions();
        this.priority = status.getPriority();
        this.state = State.fromSwig(status.getState());
        this.isNeedSaveResume = status.getNeed_save_resume();
        this.isIpFilterApplies = status.getIp_filter_applies();
        this.isUploadMode = status.getUpload_mode();
        this.isShareMode = status.getShare_mode();
        this.isSuperSeeding = status.getSuper_seeding();
        this.isPaused = status.getPaused();
        this.isAutoManaged = status.getAuto_managed();
        this.isSequentialDownload = status.getSequential_download();
        this.isSeeding = status.getIs_seeding();
        this.isFinished = status.getIs_finished();
        this.hasMetadata = status.getHas_metadata();
        this.hasIncoming = status.getHas_incoming();
        this.isSeedMode = status.getSeed_mode();
        this.isMovingStorage = status.getMoving_storage();
//    sha1_hash info_hash;
    }

    //    torrent_handle handle;
//    std::string error;
//    std::string save_path;
//    std::string name;
//    boost::intrusive_ptr<const torrent_info> torrent_file;
//    boost::posix_time::time_duration next_announce;
//    boost::posix_time::time_duration announce_interval;
//    std::string current_tracker;

    /**
     * The number of bytes downloaded and uploaded to all peers, accumulated, this session
     * only. The session is considered to restart when a torrent is paused and restarted
     * again. When a torrent is paused, these counters are reset to 0. If you want complete,
     * persistent, stats, see allTimeUpload and allTimeDownload.
     */
    public final long totalDownload;

    /**
     * The number of bytes downloaded and uploaded to all peers, accumulated, this session
     * only. The session is considered to restart when a torrent is paused and restarted
     * again. When a torrent is paused, these counters are reset to 0. If you want complete,
     * persistent, stats, see allTimeUpload and allTimeDownload.
     */
    public final long totalUpload;

    public final long totalPayloadDownload;
    public final long totalPayloadUpload;
    public final long totalFailedBytes;
    public final long totalRedundantBytes;
    //    bitfield pieces;
//    bitfield verified_pieces;
    public final long totalDone;
    public final long totalWantedDone;
    public final long totalWanted;
    public final long allTimeUpload;
    public final long allTimeDownload;
    public final int addedTime;
    public final int completedTime;
    public final int lastSeenComplete;
//    storage_mode_t storage_mode;

    /**
     * A value in the range [0, 1], that represents the progress of the torrent's
     * current task. It may be checking files or downloading.
     *
     * @return
     */
    public final float progress;
    public final int progressPpm;
    public final int queuePosition;

    /**
     * The total rates for all peers for this torrent. These will usually have better
     * precision than summing the rates from all peers. The rates are given as the
     * number of bytes per second.
     */
    public final int downloadRate;

    /**
     * The total rates for all peers for this torrent. These will usually have better
     * precision than summing the rates from all peers. The rates are given as the
     * number of bytes per second.
     */
    public final int uploadRate;

    public final int downloadPayloadRate;
    public final int uploadPayloadRate;
    public final int numSeeds;
    public final int numPeers;
    public final int numComplete;
    public final int numIncomplete;
    public final int listSeeds;
    public final int listPeers;
    public final int connectCandidates;
    public final int numPieces;
    public final int distributedFullCopies;
    public final int distributedFraction;
    public final float distributedCopies;
    public final int blockSize;
    public final int numUploads;
    public final int numConnections;
    public final int uploadsLimit;
    public final int connectionsLimit;
    public final int upBandwidthQueue;
    public final int downBandwidthQueue;
    public final int timeSinceUpload;
    public final int timeSinceDownload;
    public final int activeTime;
    public final int finishedTime;
    public final int seedingTime;
    public final int seedRank;
    public final int lastScrape;
    public final int sparseRegions;
    public final int priority;
    public final State state;
    public final boolean isNeedSaveResume;
    public final boolean isIpFilterApplies;
    public final boolean isUploadMode;
    public final boolean isShareMode;
    public final boolean isSuperSeeding;
    public final boolean isPaused;
    public final boolean isAutoManaged;
    public final boolean isSequentialDownload;
    public final boolean isSeeding;
    public final boolean isFinished;
    public final boolean hasMetadata;
    public final boolean hasIncoming;
    public final boolean isSeedMode;
    public final boolean isMovingStorage;
//    sha1_hash info_hash;

    public static enum State {
        QUEUED_FOR_CHECKING,
        CHECKING_FILES,
        DOWNLOADING_METADATA,
        DOWNLOADING,
        FINISHED,
        SEEDING,
        ALLOCATING,
        CHECKING_RESUME_DATA;

        public static State fromSwig(torrent_status.state_t state) {
            switch (state) {
                case queued_for_checking:
                    return QUEUED_FOR_CHECKING;
                case checking_files:
                    return CHECKING_FILES;
                case downloading_metadata:
                    return DOWNLOADING_METADATA;
                case downloading:
                    return DOWNLOADING;
                case finished:
                    return FINISHED;
                case seeding:
                    return SEEDING;
                case allocating:
                    return ALLOCATING;
                case checking_resume_data:
                    return CHECKING_RESUME_DATA;
                default:
                    throw new IllegalArgumentException("No enum value supported");
            }
        }
    }
}