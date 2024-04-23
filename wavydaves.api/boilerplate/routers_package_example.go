package routers

import (
	"github.com/gin-gonic/gin"
	// Import other dependencies needed by handlers (e.g., controllers)
)

func SetupRouter(r *gin.Engine) {
	// Define routes
	albums := r.Group("/albums")
	{

		albums.GET("/", getAlbums)
		albums.GET("/:id", getAlbumByID)
		albums.POST("/", postAlbums)
	}

	// Add routes for other functionalities (optional)
}
