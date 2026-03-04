
public enum Priority {
	STAT(1),
	URGENT(2),
	ROUTINE(3);

    private final int ordre;

    Priority(int ordre) {
        this.ordre = ordre;
    }

    public int getOrdre() {
        return ordre;
    }
}
