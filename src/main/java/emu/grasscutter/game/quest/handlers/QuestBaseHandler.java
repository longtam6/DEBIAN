package emu.grasscutter.game.quest.handlers;

import emu.grasscutter.data.custom.QuestConfigData.QuestCondition;
import emu.grasscutter.game.quest.GameQuest;

public abstract class QuestBaseHandler {
	
	public abstract boolean execute(GameQuest quest, QuestCondition condition, int... params);
	
}
