drop table user;

CREATE TABLE `user` (
  `userId` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `firstName` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `lastName` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `virtualBalance` decimal(14,2) NOT NULL DEFAULT '0.00',
  `winnings` decimal(14,2) NOT NULL DEFAULT '0.00',
  `status` enum('ACTIVE','BLACKLISTED') CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `modified` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tournament` (
  `tournamentId` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `start_time` timestamp NOT NULL,
  `status` enum('ACTIVE','INACTIVE') CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`tournamentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `match` (
  `matchId` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `teamA` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `teamB` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `oddsA` decimal(5,2) NOT NULL,
  `oddsB` decimal(5,2) NOT NULL,
  `start_time` timestamp NOT NULL,
  `team_won` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `tournamentId` int(11) DEFAULT NULL,
  `status` enum('ACTIVE','INACTIVE') CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`matchId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tournament_teams` (
  `tournamentTeamId` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `tournamentId` int(11) NOT NULL,
  `teamName` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `tournamentOdds` decimal(5,2) NOT NULL,
  `tournamentPosition` int(4) DEFAULT NULL,
  `status` enum('ACTIVE','INACTIVE') CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`tournamentTeamId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tournament_details` (
  `tournamentDetailId` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `tournamentId` int(11) NOT NULL,
  `tournamentTeamId` int(11) DEFAULT NULL,
  `virtualBalance` decimal(14,2) NOT NULL DEFAULT '0.00',
  `winnings` decimal(14,2) NOT NULL DEFAULT '0.00',
  `tournamentRanking` int(11) NULL,
  `status` enum('ACTIVE','INACTIVE') CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`tournamentDetailId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `bet_transaction` (
  `betId` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `matchId` int(11) NOT NULL,
  `amount` decimal(14,2) NOT NULL,
  `selectedTeam` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `selectedOdds` decimal(5,2) NOT NULL,
  `tournamentId` int(11) DEFAULT NULL,
  `status` enum('ACTIVE','INACTIVE') CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`betId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

