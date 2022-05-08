package eu.york.project;

import java.util.Objects;

public class JsonResponse {
    private String name;
    private float amount;
    private String slug;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonResponse that = (JsonResponse) o;
        return Float.compare(that.amount, amount) == 0 && Objects.equals(name, that.name) && Objects.equals(slug, that.slug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, slug);
    }

    @Override
    public String toString() {
        return "JsonResponse{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", slug='" + slug + '\'' +
                '}';
    }
}